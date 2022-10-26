<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/views/header/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
     //목록으로
	$(document).on('click','#btnList',function() {
		location.href = "${pageContext.request.contextPath}/board/getBoardList";
});
	
	
</script>
</head>
<body>
	<article>
		<div class="container" role="main">
			<h2>Book Quiz</h2>
			<div class="bg-white rounded shadow-sm">
				<div class="board_question">
					<c:out value="${boardContent.question}" />
				</div>
				<div class="board_quiz_box">
					<span class="board_dk_book_idx">책 번호:<c:out
							value="${boardContent.dk_book_idx}" />학년:</span><c:out
							value="${boardContent.gradations}" /></span>
				</div>
			
				<div class="board_answer">
				    정답 : 
					<c:out value="${boardContent.answer}" />
				</div>
			</div>
			<div style="margin-top: 20px">
				<button type="button" class="btn btn-sm btn-primary" id="btnUpdate">수정</button>
				<button type="button" class="btn btn-sm btn-primary" id="btnDelete">삭제</button>
				<button type="button" class="btn btn-sm btn-primary" id="btnList">목록</button>
			</div>
		</div>
	</article>

</body>
</html>