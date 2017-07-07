<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="kobin.member.MemberDao"%>

<jsp:useBean id="dto" class="kobin.member.MemberDto"/>
<jsp:setProperty property="*" name="dto"/>

<%
	MemberDao.getInstance().update(dto);
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>/users/private/update.jsp</title>
</head>

<body>
	<p><%=dto.getMemberId() %> 회원님 정보를 수정했습니다.</p>
	<a href="info.jsp">확인</a>
</body>
</html>
