<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="kobin.member.MemberDao"%>

<jsp:useBean id="dto" class="kobin.member.MemberDto" />
<jsp:setProperty property="*" name="dto"/>

<%
	boolean isSuccess = MemberDao.getInstance().insert(dto);	
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>/member/memberInsert.jsp</title>
	<link rel="stylesheet" href="../resource/css/bootstrap.css" />
	<script src="../resource/js/jquery-3.2.0.js"></script>
</head>

<body>
<%if(isSuccess){ %>
	<script>
		alert("가입 성공");
		location.href="memberLoginForm.jsp";
	</script>
<%}else{%>
	<script>
		alert("가입 실패");
		location.href="memberInsertForm.jsp";
	</script>
<%} %>
</body>
</html>
