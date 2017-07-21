<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
	<meta name="viewport" content="width=device-width, initial-scale=1"/>
	<title>views/home.jsp</title>
	<style>
		.indexTag a{
			font-size: 20px;
			margin-right: 10%;
		}
	</style>
</head>

<body>
	<h3>공지사항</h3>
	<ul>
		<c:forEach var="tmp" items="${requestScope.info }">
			<li>${tmp }</li>
		</c:forEach>
	</ul>
	
	<div class="indexTag">
		<!-- 지금의 '첫 요청'으로 command는 '/member/list'로 요청된다.( 상대 경로의 기준이 된다.) -->
		<a href="${pageContext.request.contextPath }/board/list.do">게시글 목록 보기</a>
	</div>	
</body>
</html>
