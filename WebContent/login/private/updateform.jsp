<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="kobin.member.MemberDto"%>
<%@page import="kobin.member.MemberDao"%>

<%
	// 세션에 저장된 회원의 아이디를 이용해서 회원정보를 얻어온다.
	String id = (String)session.getAttribute("id");
	MemberDto dto = MemberDao.getInstance().getData(id);
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>/users/private/updateform.jsp</title>
	<script>
		document.querySelector("#updateForm").addEventListener("submit", function(event){
			var inputPwd=document.querySelector("#pwd").value;
			var inputPwd2=document.querySelector("#pwd2").value;
			
			if(inputPwd != inputPwd2){
				alert("비밀번호가 일치하지 않습니다.");
				event.preventDefault(); // 폼전송 막기
			}
		})
	</script>
</head>

<body>
	<h3>회원정보 수정 페이지 입니다.</h3>
	
	<form action="update.jsp" method="post" id="updateForm">
		<input type="hidden" name="id" value="<%=id%>"/>
		
		<label for="id">아이디</label>
		<input type="text" id="id" value="<%=id%>" disabled="disabled"/><br/>
		
		<label for="pwd">비밀번호</label>
		<input type="password" name="pwd" id="pwd" value="<%=dto.getMemberPwd()%>"/><br/>
		
		<label for="pwd2">비밀번호 확인</label>
		<input type="password" id="pwd2" value="<%=dto.getMemberPwd()%>"/><br/>
		
		<label for="email">이메일 주소</label>
		<input type="text" name="email" id="email" value="<%=dto.getMemberEmail()%>"/><br/>
		
		<button type="submit">수정 확인</button>
	</form>
</body>
</html>
