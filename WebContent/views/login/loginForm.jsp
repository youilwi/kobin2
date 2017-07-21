<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
	<meta name="viewport" content="width=device-width, initial-scale=1"/>
	
	<title>/views/login/loginForm.jsp</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath }/resource/css/bootstrap.css"/>
	<script src="${pageContext.request.contextPath }/resource/js/jquery-3.2.0.js"></script>
	<script src="${pageContext.request.contextPath }/resource/js/bootstrap.js"></script>
</head>

<body>
<div class="col-xs-6 mainCenter">
	<div class="row">
		<div class="col-xs-12 mainCenterFull">
			<br/>
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
		</div><!-- mainCenterFull -->
	</div>
</div><!-- mainCenter -->
</body>
</html>
