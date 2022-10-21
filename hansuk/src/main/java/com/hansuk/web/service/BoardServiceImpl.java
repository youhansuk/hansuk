package com.hansuk.web.service;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import com.hansuk.web.dao.BoardDAO;
import com.hansuk.web.model.BoardVO;




	@Service
	public class BoardServiceImpl implements BoardService {	
		
		@Inject	
		private BoardDAO boardDAO;		
		
		public List<BoardVO> getBoardList() throws Exception {		
			return boardDAO.getBoardList();	
			}
		
	}
	
