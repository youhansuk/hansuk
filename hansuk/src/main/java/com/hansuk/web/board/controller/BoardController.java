package com.hansuk.web.board.controller;


import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hansuk.web.common.Pagination;
import com.hansuk.web.service.BoardService;


@Controller
@RequestMapping(value = "/board")
public class BoardController {

	@Inject	
	private BoardService boardService;	
	
	@RequestMapping(value = "/getBoardList", method = RequestMethod.GET)	
	public String getBoardList(Model model
			,@RequestParam(required = false, defaultValue = "1") int page
			,@RequestParam(required = false, defaultValue = "1") int range
			) throws Exception {	
		
		//전체 게시글
		int listCnt = boardService.getBoardListCnt();
		
		//Pagination
		Pagination pagination = new Pagination();
		pagination.pageInfo(page, range, listCnt);
		
		
	    model.addAttribute("pagination",pagination);
		model.addAttribute("boardList", boardService.getBoardList(pagination));
		return "board/quiz";	
		}
	}	
	
