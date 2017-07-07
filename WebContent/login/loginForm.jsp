<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<% 
	String url=request.getParameter("url");
	if(url==null){
		url=request.getContextPath();
	}
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>/login/login.jsp</title>
	<link rel="stylesheet" href="../resource/css/bootstrap.css" />
	<script src="../resource/js/jquery-3.2.0.js"></script>
</head>

<body>

<jsp:include page="../include/navbar.jsp" ></jsp:include>

<div class="container" style="margin-top:250px">	
	<div class="row">
		<div class="col-sm-6 col-sm-offset-3">
			<h3>로그인 페이지 입니다.</h3>
			<form action="signin.jsp?url=<%=url %>" method="post">
			<div class="form-group">			
				<label for="memberId">아이디</label>
				<input type="text" class="form-control" name="memberId" id="memberId" />
			</div>
			<div class="form-group">			
				<label for="memberPwd">비밀번호</label>
				<input type="password" class="form-control" name="memberPwd" id="memberPwd"/>
			</div>
	
			<div class="checkbox">
				<label>
					<input type="checkbox"> 아이디 저장
				</label>
			</div>
			
			<button type="submit" class="btn btn-primary">로그인</button>
			<button type="reset" class="btn btn-warning" 
					onclick="location.href='../index.jsp'">뒤로</button>
		</form>
		</div>
	</div>
</div>


</body>
</html>