package com.hansuk.web.dao;

import java.util.List;

import com.hansuk.web.model.BoardVO;

public interface BoardDAO {
   
	public List<BoardVO> getBoardList() throws Exception;
	
}
