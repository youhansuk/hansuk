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
		
		public List<BoardVO> getBoardList(Pagination pagination) throws Exception {		
			return boardDAO.getBoardList(pagination);	
			}
		
		
		@Override
		public int getBoardListCnt() throws Exception {
			return boardDAO.getBoardListCnt();
		}
	}
	
