package com.hansuk.web.service;


import java.util.List;
import java.util.Map;

import com.hansuk.web.common.Pagination;
import com.hansuk.web.model.BoardVO;

public interface BoardService {
   
	
	//�Խù� ����Ʈ
	public List<BoardVO> getBoardList(Pagination pagination) throws Exception;
	
	//�� �Խù� 
	public int getBoardListCnt() throws Exception;
	
	//�� ����
	public void insertBoard(BoardVO boardVO) throws Exception;
	
	//����ȸ
	public BoardVO getBoardContent(int idx) throws Exception;
	
}
