package com.hansuk.web.service;


import java.util.List;
import java.util.Map;

import com.hansuk.web.common.Pagination;
import com.hansuk.web.model.BoardVO;

public interface BoardService {
   
	
	//게시물 리스트
	public List<BoardVO> getBoardList(Pagination pagination) throws Exception;
	
	//총 게시물 
	public int getBoardListCnt() throws Exception;
	
	//글 쓰기
	public void insertBoard(BoardVO boardVO) throws Exception;
	
	//상세조회
	public BoardVO getBoardContent(int idx) throws Exception;
	
}
