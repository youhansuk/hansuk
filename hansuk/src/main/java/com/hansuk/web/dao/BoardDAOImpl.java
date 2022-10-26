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
		return sqlSession.selectList("com.hansuk.web.board.boardMapper.getBoardList", pagination);
	}

	@Override
	public int getBoardListCnt() throws Exception {
		return sqlSession.selectOne("com.hansuk.web.board.boardMapper.getBoardListCnt");
	}

	@Override
	public BoardVO getBoardContent(int idx) throws Exception {
		return sqlSession.selectOne("com.hansuk.web.board.boardMapper.getBoardContent", idx);
	}

	@Override
	public int insertBoard(BoardVO boardVO) throws Exception {
		return sqlSession.insert("com.hansuk.web.board.boardMapper.insertBoard", boardVO);
	}

	@Override
	public int updateBoard(BoardVO boardVO) throws Exception {
		return sqlSession.update("com.hansuk.web.board.boardMapper.updateBoard", boardVO);
	}

	@Override
	public int deleteBoard(int idx) throws Exception {
		return sqlSession.insert("com.hansuk.web.board.boardMapper.deleteBoard", idx);
	}

	@Override
	public int updateViewCnt(int idx) throws Exception {
		return sqlSession.update("com.hansuk.web.board.boardMapper.updateViewCnt", idx);
	}

}
