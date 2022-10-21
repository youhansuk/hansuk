package com.hansuk.web.service;


import java.util.List;
import java.util.Map;

import com.hansuk.web.common.Pagination;
import com.hansuk.web.model.BoardVO;

public interface BoardService {
   
	public List<BoardVO> getBoardList(Pagination pagination) throws Exception;
	
	//ÃÑ °Ô½Ã¹°
	public int getBoardListCnt() throws Exception;
}
