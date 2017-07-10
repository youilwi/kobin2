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
	<link rel="stylesheet" href="../../resource/css/bootstrap.css" />
	<script src="../../resource/js/jquery-3.2.0.js"></script>
</head>

<body>

<div class="container" style="margin-top:150px">	
	<div class="row">
		<div class="col-sm-6 col-sm-offset-3">
			<h3 style="text-align:center;">[ 로그-인 화면 ]</h3><br/>

			<form class="form-horizontal">
				<div class="form-group">
					<label for="id" class="col-xs-3 col-xs-offset-1 control-label">아이디</label>
					<div class="col-xs-6">
						<input type="text" class="form-control" id="id"/>
					</div>
				</div>

				<div class="form-group">
					<label for="pwd2" class="col-xs-3 col-xs-offset-1 control-label">비밀번호</label>
					<div class="col-xs-6">
						<input type="password" class="form-control" id="pwd2"/>
					</div>
				</div>

				<div class="form-group">
					<div class="col-xs-6 col-xs-offset-4">
						<label>
							<input type="checkbox"/> 아이디 저장
						</label>
					</div>
				</div>

				<div class="form-group">
					<div class="col-xs-6 col-xs-offset-4">
						<button type="submit" class="btn btn-primary">로그ㅡ인</button>
						&nbsp;&nbsp;&nbsp;&nbsp;
						<button onclick="" class="btn btn-success">회원가입</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>
</body>
</html>