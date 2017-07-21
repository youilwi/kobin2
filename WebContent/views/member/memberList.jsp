<%@page import="kobin.company.CompanyDao"%>
<%@page import="kobin.company.CompanyDao"%>
<%@page import="kobin.member.MemberDto"%>
<%@page import="kobin.member.MemberDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	MemberDao dao = MemberDao.getInstance();
	CompanyDao dao2 = CompanyDao.getInstance();
	List<MemberDto> list = dao.getList();
%>	

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>/member/memberList.jsp</title>
	<link rel="stylesheet" href="../resource/css/bootstrap.css" />
	<style>
		th, td{
			height: 30px;
		}
		caption{
			font-size: 24px;
		}
	</style>
</head>

<body>
	<div class="container">
		<div class="row contents">
			<div class="col-xs-12" style="text-align:center;">
				<h3>[ 회원 리스트 화면 ]</h3>

				<table id="memberList" border="1" cellspacing="0">
					<caption>회원 목록</caption>

					<colgroup>
						<col width="100"/>
						<col width="100"/>
						<col width="100"/>
						<col width="200"/>
						<col width="50"/>
						<col width="200"/>
						<col width="150"/>
						<col width="100"/>
						<col width="200"/>
					</colgroup>

					<thead>
						<tr style="height:40px;">
							<th>아이디</th>
							<th>이름</th>
							<th>비밀번호</th>
							<th>회사이름</th>
							<th style="text-align:center;">등급</th>							
							<th>이메일</th>
							<th>핸드폰</th>
							<th>작업지역</th>
							<th>가입일자</th>
						</tr>
					</thead>

					<tbody id="memberList">
 					<%for(MemberDto tmp : list){ %>
						<tr>
							<td><%=tmp.getMemberId() %></td>
							<td><%=tmp.getMemberName() %></td>
							<td><%=tmp.getMemberPwd() %></td>
							<td><%=dao2.getData(tmp.getCompanyNo()).getCompanyName() %></td>
							<td style="text-align:center;"><%=tmp.getMemberLevel() %></td>
							<td><%=tmp.getMemberEmail() %></td>
							<td><%=tmp.getMemberPhone() %></td>
							<td><%=tmp.getWorkArea() %></td>
							<td><%=tmp.getRegDate() %></td>
						</tr>
					<%} %>
					</tbody>
				</table><br/>

				<button type="button" class="btn btn-primary"
					onclick="javascript:location.href='memberInsertForm.jsp'" >회원 가입</button>
			</div>	
		</div>
	</div>
</body>
</html>
