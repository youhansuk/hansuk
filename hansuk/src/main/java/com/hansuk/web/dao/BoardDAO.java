package com.hansuk.web.dao;

import java.util.List;

import com.hansuk.web.common.Pagination;
import com.hansuk.web.model.BoardVO;

public interface BoardDAO {
   
	public List<BoardVO> getBoardList(Pagination pagination) throws Exception;
	
	public int getBoardListCnt() throws Exception;
	
}
