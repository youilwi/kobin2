<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>/users/signup_form.jsp</title>
<!-- bootstrap.css 로딩하기 -->
<link rel="stylesheet" href="../resource/css/bootstrap.css" />
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-sm-6 col-sm-offset-3">
			<h3>회원 가입 페이지 입니다.</h3>
			<form action="signup.jsp" method="post">
			<div class="form-group">
				<label for="memberId">아이디</label>
				<input type="text" class="form-control" name="memberId" id="memberId" />
				<!-- form-group 안에 form-control 로 작성하면 레이블 밑에 input 요소가 자동으로 정렬되(원래는 옆으로 붙어) -->
				<!-- <p class="help-block">반드시 입력하세요</p> -->
			</div>
			<div class="form-group">
				<label for="memberPwd">비밀번호</label>
				<input type="password" class="form-control" name="memberPwd" id="memberPwd" />				
			</div>
			<div class="form-group">
				<label for="memberPwd2">비밀번호 확인</label>
				<input type="password" class="form-control" name="memberPwd2" id="memberPwd" />				
			</div>			
			<div class="form-group">
				<label for="memberName">이름</label>
				<input type="text" class="form-control" name="memberName" id="memberName" /><br/>		
			</div>
			<div class="form-group">
				<label for="companyNo">회사 번호</label>
				<input type="text" class="form-control" name="companyNo" id="companyNo" /><br/>
				<!-- form 안에서 사용하였을 경우,
				'readonly' 는 form 전송이 가능하지만,
				'disabled' 는 form 전송시 값이 전달되지 않는다. -->		
			</div>
			<div class="form-group">
				<label for="memberLevel">회원등급</label><br/>
				<!-- <input type="text" class="form-control" name="memberLevel" id="memberLevel" /><br/> -->
				<label class="radio-inline">
			    	<input type="radio" name="memberLevel">일반회원
			    </label>
			    <label class="radio-inline">
			    	<input type="radio" name="memberLevel">회사회원
			    </label>
				<br/>
			</div>
			<div class="form-group">
				<label for="memberEmail">이메일</label>
				<input type="text" class="form-control" name="memberEmail" id="memberEmail" /><br/>		
			</div>
			<div class="form-group">
				<label for="memberPhone">전화번호</label>
				<input type="text" class="form-control" name="memberPhone" id="memberPhone" /><br/>		
			</div>
			<div class="form-group">
				<label for="workArea">거주지</label>
				<input type="text" class="form-control" name="workArea" id="workArea" /><br/>		
			</div>
			

			<button type="submit" class="btn btn-primary">가입</button>
			<button type="reset" class="btn btn-warning"  onclick="location.href='../index.jsp'">뒤로</button>
		</form>
		</div>
	</div>
</div>

<script src="../resource/js/jquery-3.2.0.js"></script>

</body>
</html>