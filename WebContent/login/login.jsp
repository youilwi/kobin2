<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="kobin.member.MemberDao"%>

<jsp:useBean id="dto" class="kobin.member.MemberDto"/>
<jsp:setProperty property="*" name="dto"/>

<%
	boolean isValid = MemberDao.getInstance().isValid(dto);
	String url=request.getParameter("url");
	if(url==null){
		url=request.getContextPath();
	}
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>users/signin.jsp</title>
	<link rel="stylesheet" href="../resource/css/bootstrap.css" />
	<script src="../resource/js/jquery-3.2.0.js"></script>
</head>

<body>
<%if(isValid){ 
	session.setAttribute("id", dto.getMemberId());%>
	<p> <strong><%=dto.getMemberId() %></strong> 님 로그인 되었습니다.</p>
	<a href="<%=url%>">확인</a>
<%}else{ %>
	<p> 아이디 혹은 비밀번호가 틀려요.</p>
	<a href="signin_form.jsp?url=<%=url%>">로그인 페이지로 가기</a>
<%} %>
</body>
</html>
