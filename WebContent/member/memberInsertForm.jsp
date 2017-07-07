<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<jsp:useBean id="dto" class="kobin.member.MemberDto"/>
<jsp:setProperty property="*" name="dto"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>memberInsert.jsp</title>
	<link rel="stylesheet" href="../resource/css/bootstrap.css" />
	<style>
		th, td{
			padding: 5px;
		}
	</style>
	<script>
		function searchCompanyName(){
			window.open("searchCompany.jsp", "소속회사 찾기", 
					"width=500, height=400, top=300, left=300");
		}
	</script>
</head>

<body>
	<div class="container">
		<div class="col-xs-4 col-xs-offset-4 mainContents">
			<form id="memberInsertForm" action="/memberInsertAction" method="post">
			
				<div class="row"><br/><br/>
					<h3 style="text-align:center;">[ 회원가입 화면 ]</h3><br/>
					
					<table>
						<thead>
							<tr>
								<th width="100"></th>
								<th width="200"></th>
								<th width="100"></th>
							</tr>							
						</thead>
						
						<tbody>
							<tr>
								<td><label for="memberName">이름</label></td>
								<td colspan="2">
									<input type="text" class="form-control" id="memberName" name="memberName" />
								</td>
							</tr>
							<tr>
								<td><label for="memberId">아이디</label></td>
								<td colspan="2">
									<input type="text" class="form-control" id="memberId" name="memberId" />
								</td>
							</tr>
							<tr>
								<td><label for="memberPwd">비밀번호</label></td>
								<td colspan="2">
									<input type="password" class="form-control" id="memberPwd" name="memberPwd" />
								</td>
							</tr>
							<tr>
								<td><label for="memberPwd2">비밀번호</label></td>
								<td colspan="2">
									<input type="password" class="form-control" id="memberPwd2" name="memberPwd2" />
								</td>
							</tr>
							<tr>
								<td><label>회사정보</label></td>
								<td>
									<input type="text" class="form-control" id="companyNo" name="companyNo" readonly/>
									<input type="text" class="form-control" id="companyName" name="companyName" readonly/>
								</td>
								<td>
									<button type="button" class="btn btn-primary" onclick="javascript:searchCompanyName()" >소속<br/>회사찾기</button>
								</td>
							</tr>
							<tr>
								<td><label for="memberEmail">이메일</label></td>
								<td colspan="2">
									<input type="text" class="form-control" id="memberEmail" name="memberEmail"/>
								</td>
							</tr>
							<tr>
								<td><label for="memberPhone">전화번호</label></td>
								<td colspan="2">
									<input type="text" class="form-control" id="memberPhone" name="memberPhone"/>
								</td>
							</tr>
							<tr>
								<td><label for="memberLevel">멤버등급</label></td>
								<td colspan="2">
									<input type="text" class="form-control" id="memberLevel" name="memberLevel"/>
								</td>
							</tr>
							<tr>
								<td><label for="workArea">지역이름</label></td>
								<td colspan="2">
									<input type="text" class="form-control" id="workArea" name="workArea"/>
								</td>
							</tr>
							<tr>
								<td colspan="3" style="text-align:center;">
									<button type="submit" class="btn btn-primary" id="saveBtn">
										<i class="glyphicon glyphicon-save"></i>&nbsp;회원가입
									</button>&nbsp;&nbsp;&nbsp;
									<button type="reset" class="btn btn-warning" id="cancelBtn">
										<i class="glyphicon glyphicon-remove"></i>&nbsp;취소
									</button>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</form>
		</div>
	</div>
</body>
</html>
