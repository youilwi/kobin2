<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="kobin.member.MemberDto"%>
<%@page import="kobin.member.MemberDao"%>

<%
   //로그인된 id를 읽어온다.
   String id=(String)session.getAttribute("id");
   //id에 해당하는 회원정보 얻어오기
   MemberDto dto = MemberDao.getInstance().getData(id);
%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>/users/private/info.jsp</title>
	<script>
	   function userConfirm(){
	      var isDelete=confirm("탈퇴하시겠습니까?");
	      
	      if(isDelete){
	         location.href="delete.jsp";
	      }	      
	   }
	</script>
</head>

<body>
	<h3>회원 가입된 개인정보 입니다.</h3>
	
	<table>
	   <thead>
	      <tr>
	         <th>항목</th>
	         <th>정보</th>
	      </tr>
	   </thead>
	   <tbody>
	      <tr>
	         <th>아이디</th>
	         <td><%=dto.getMemberId() %></td>
	      </tr>
	      <tr>
	         <th>이메일</th>
	         <td><%=dto.getMemberEmail() %></td>
	      </tr>
	      <tr>
	         <th>가입일</th>
	         <td><%=dto.getRegDate() %></td>
	      </tr>
	   </tbody>
	</table><br/>
	
	<a href="updateform.jsp">가입정보 수정</a>
	<a href="javascript:userConfirm()">회원탈퇴</a>
</body>
</html>
