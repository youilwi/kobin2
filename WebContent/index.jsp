<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
	String id = (String)session.getAttribute("id");
	String cPath = request.getContextPath();
%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>index.jsp</title>
	<link rel="stylesheet" href="resource/css/bootstrap.css" />
</head>

<body>

<%if(id != null){ %>
	<p>
		<a href="users/private/info.jsp"><%=id %></a>
		회원님 로그인 되었입니다.
	</p>&nbsp;&nbsp;&nbsp;
	<a href="login/logout.jsp">로그아웃</a>
<%} %>

<div class="container">
	<div class="row">
		<div class="col-xs-4 col-xs-offset-4">
		
			<br/><br/><br/><br/><br/>
			<h3>INDEX 홈 페이지</h3><br/>
		
			<ul style="font-size: 24px;">
				<li><a href="member/memberInsertForm.jsp">회원가입</a></li>
				<li><a href="login/loginForm.jsp?url=<%=cPath%>">로그인</a></li>	
				
				<li><a href="company/companyList.jsp">가입회원사 현황</a></li>
				<li><a href="order/orderList.jsp">설비견적 주문 현황</a></li>
				
				<li><a href="board/boardList.jsp">게시판 현황(비회원전용)</a></li>
				<li><a href="member/memberDelete.jsp">회원탈퇴</a></li>
			</ul>
		</div>
	</div>
</div>
</body>
</html>
