<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>/manager/company/companyList.jsp</title>
	<link rel="stylesheet" href="../../resource/css/bootstrap.css" />
	<script src="../../resource/js/jquery-3.2.0.js"></script>
</head>

<body>
<div class="container">
	<div class="row">
		<div class="col-xs-8 col-xs-offset-2">
			<form>
				<br/><h3 style="text-align:center;">[ 가입 회원사 현황 ]</h3><br/>
			
				<table class="table table-striped">
			       	<colgroup>
			       		<col class="col-xs-2"/>
			       		<col class="col-xs-2"/>
			       		<col class="col-xs-2"/>
						<col class="col-xs-2"/>
						<col class="col-xs-2"/>
						<col class="col-xs-2"/>
					</colgroup>
			
					<thead>
						<tr>
							<th>회사번호</th>
							<th>회사이름</th>
							<th>대표자</th>
							<th>핸드폰</th>
							<th>작업지역</th>
							<th>작업번호</th>
						</tr>
					</thead>
					<tbody>
<%for(int i=0; i<10; i++){ %>
						<tr>
							<td>01</td>
							<td><a href="#">(주)새롬</a></td>
							<td>홍길동</td>
							<td>010-4569-3366</td>
							<td>경기도</td>
							<td>10</td>
						</tr>
<%} %>
					</tbody>
				</table>
			</form>
		</div>
	</div>
</div>
</body>
</html>
