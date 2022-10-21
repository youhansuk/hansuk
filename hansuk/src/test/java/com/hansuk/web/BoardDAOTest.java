package com.hansuk.web;

import java.util.List;
import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hansuk.web.common.Pagination;
import com.hansuk.web.dao.BoardDAO;
import com.hansuk.web.model.BoardVO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { 
		"classpath:spring/root-context.xml",
		"classpath:spring/dataSource-context.xml" 
		})

public class BoardDAOTest {

	private static final Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);
	
	@Inject
	private BoardDAO boardDAO;

	@Test
	public void testGetBoardList() throws Exception {
		List<BoardVO> boardList = boardDAO.getBoardList();
		logger.info("\n Board List \n ");
		if (boardList.size() > 0) {
			for (BoardVO list : boardList) {
				logger.info(list.question);
			}
		} else {
			logger.info("데이터가 없습니다.");
		}
	}

}
