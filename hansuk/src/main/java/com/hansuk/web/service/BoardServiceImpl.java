package com.hansuk.web.service;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;

import com.hansuk.web.common.Pagination;
import com.hansuk.web.dao.BoardDAO;
import com.hansuk.web.model.BoardVO;




	@Service
	public class BoardServiceImpl implements BoardService {	
		
		@Inject	
		private BoardDAO boardDAO;		
		
		//게시물 리스트
		public List<BoardVO> getBoardList(Pagination pagination) throws Exception {		
			return boardDAO.getBoardList(pagination);	
			}
		
		//총 개수
		@Override
		public int getBoardListCnt() throws Exception {
			return boardDAO.getBoardListCnt();
		}
		
		// 글 등록
		@Override
		public void insertBoard(BoardVO boardVO) throws Exception {
			boardDAO.insertBoard(boardVO);
		}
		// 상세조회
		public BoardVO getBoardContent(int idx) throws Exception {
			boardDAO.updateViewCnt(idx);
			return boardDAO.getBoardContent(idx);
		}
		
	}
	
