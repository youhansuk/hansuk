<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>board list</h2>	
  <table>		
    <colgroup>			
      <col width="50"/>			
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
                  	    <td><c:out value="${list.idx}"/></td>
                  	    <td><c:out value="${list.dk_book_idx}"/></td>
                  	    <td><c:out value="${list.gradations}"/></td>
                  	    <td><c:out value="${list.question}"/></td>
                  	    <td><c:out value="${list.answer}"/></td>
                  	    <td><c:out value="${list.use_yn}"/></td>
                  	</tr>					
                 </c:forEach>				
               
              </tbody>	
             </table>
</body>
</html>
