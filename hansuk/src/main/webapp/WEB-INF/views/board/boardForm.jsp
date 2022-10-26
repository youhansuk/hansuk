<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/views/header/header.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous">
	
</script>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
<title>Board</title>
<script>
	$(document).on('click', '#btnSave', function(e) {
		e.preventDefault();
		$("#form").submit();
		
	});

	$(document)
			.on(
				'click',
				'#btnList',
				function(e) {
				e.preventDefault();
				location.href = "${pageContext.request.contextPath}/board/getBoardList";
	});
</script>
<style>
body {
	  padding-top: 70px;
	  padding-bottom: 30px;
}
</style>
</head>
<body>
	<article>
		<div class="container" role="main">
			<h2>Quiz Form</h2>
			<form name="form" id="form" role="form" method="post"
				action="${pageContext.request.contextPath}/board/saveBoard">
				<div class="mb-3">
					<label for="dk_book_idx">책 번호</label> <input type="text"
						class="form-control" name="dk_book_idx" id="dk_book_idx"
						placeholder="책 번호를 입력해 주세요">
				</div>
				<div class="mb-3">
					<label for="gradations">학년</label> <input type="text"
						class="form-control" name="gradations" id="gradations"
						placeholder="학년을 입력해 주세요">
				</div>
				<div class="mb-3">
					<label for="question">문제</label>
					<textarea class="form-control" rows="5" name="question" id="question"
						placeholder="문제를 입력해 주세요"></textarea>
				</div>
				<div class="mb-3">
					<label for="answer">답</label> <input type="text"
						class="form-control" name="answer" id="answer" placeholder="답을 입력해 주세요">
				</div>
			</form>
			<div>
				<button type="button" class="btn btn-sm btn-primary" id="btnSave">저장</button>
				<button type="button" class="btn btn-sm btn-primary" id="btnList">목록</button>
			</div>
		</div>
	</article>
</body>
</html>
