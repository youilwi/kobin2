<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
	<meta name="viewport" content="width=device-width, initial-scale=1"/>
	<title>error/404.jsp</title>
</head>

<body>
	<p>( 404오류 ) 죄송합니다. <br />
		요청하신 페이지는 찾을 수가 없습니다. <br />
		요청하신 URL을 다시한번 확인해 보시기 바랍니다.</p>
	<a href="${pageContext.request.contextPath }">인덱스로 가기</a>
</body>
</html>
