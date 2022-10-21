package com.hansuk.web.dao;

import java.util.List;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hansuk.web.common.Pagination;
import com.hansuk.web.model.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession sqlSession;

	@Override
	public List<BoardVO> getBoardList(Pagination pagination) throws Exception {
		return sqlSession.selectList("com.hansuk.web.board.boardMapper.getBoardList",pagination);
	}
    
	@Override
	public int getBoardListCnt() throws Exception {
		return sqlSession.selectOne("com.hansuk.web.board.boardMapper.getBoardListCnt");
	}
}
