package com.hansuk.web.service;


import java.util.List;
import java.util.Map;

import com.hansuk.web.model.BoardVO;

public interface BoardService {
   
	public List<BoardVO> getBoardList() throws Exception;
	
}
