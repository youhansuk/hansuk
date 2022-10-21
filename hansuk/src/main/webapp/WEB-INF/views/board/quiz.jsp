<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html> 
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous">
</script>
<script>
	//이전 버튼 이벤트
	function fn_prev(page, range, rangeSize) {
		var page = ((range - 2) * rangeSize) + 1;
		var range = range - 1;

		var url = "${pageContext.request.contextPath}/board/getBoardList";
		url = url + "?page=" + page;
		url = url + "&range=" + range;

		location.href = url;
	}

	//페이지 번호클릭
	function fn_pagination(page, range, rangeSize, searchType, keyword) {
		var url = "${pageContext.request.contextPath}/board/getBoardList";
		url = url + "?page=" + page;
		url = url + "&range=" + range;
		location.href = url;
	}

	//다음버튼이벤트
	function fn_next(page, range, rangeSize) {
		var page = parseInt((range * rangeSize)) + 1;
		var range = parseInt(range) + 1;

		var url = "${pageContext.request.contextPath}/board/getBoardList";
		url = url + "?page=" + page;
		url = url + "&range=" + range;
		location.href = url;
	}
</script>
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-
GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" 
crossorigin="anonymous">

</head>
<body>

	<h2>board list</h2>
	<article>
	<div class="container">
	<div class="table-responsive">
	<table class="table table-striped table-sm">
		<colgroup>
			<col width="50" />
			<col width="70" />
			<col width="70" />
			<col width="700" />
			<col width="300" />
			<col width="50" />
		</colgroup>
		<thead>
			<tr>
				<th>퀴즈 번호</th>
				<th>책 번호</th>
				<th>학년</th>
				<th>문제</th>
				<th>답</th>
				<th>Y/N</th>
			</tr>
		</thead>
		<tbody>


			<c:forEach var="list" items="${boardList}">
				<tr>
					<td><c:out value="${list.idx}" /></td>
					<td><c:out value="${list.dk_book_idx}" /></td>
					<td><c:out value="${list.gradations}" /></td>
					<td><c:out value="${list.question}" /></td>
					<td><c:out value="${list.answer}" /></td>
					<td><c:out value="${list.use_yn}" /></td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
	</div>
	</div>
	</article>

	<!-- pagination{s} -->
	<div id="paginationBox">
		<ul class="pagination">
			<c:if test="${pagination.prev}">
				<li class="page-item"><a class="page-link" href="#"
					onClick="fn_prev('${pagination.page}', '${pagination.range}', '${pagination.rangeSize}')">Previous</a></li>
			</c:if>
			<c:forEach begin="${pagination.startPage}"
				end="${pagination.endPage}" var="idxx">
				<li
					class="page-item <c:out value="${pagination.page == idxx ? 'active' : ''}"/> ">
					<a class="page-link" href="#"
					onClick="fn_pagination('${idxx}', '${pagination.range}',
 '${pagination.rangeSize}')">
						${idxx} </a>
				</li>
			</c:forEach>
			<c:if test="${pagination.next}">
				<li class="page-item"><a class="page-
link"  href="#"
					 onClick="fn_next('${pagination.range}',
 '${pagination.range}', '${pagination.rangeSize}')" >Next</a></li>
			</c:if>
		</ul>
	</div>
	<!-- pagination{e} -->
</body>
</html>
