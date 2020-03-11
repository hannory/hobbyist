<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.dh.hobbyist.admin.model.vo.Admin"%>
<% Admin loginAdmin = (Admin) session.getAttribute("loginAdmin"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css?family=ZCOOL+QingKe+HuangYou&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Do+Hyeon&display=swap" rel="stylesheet">
<style>
		body {
 		margin: 0px;
 		width: 1440px;
	 	height: 1000px;
 		margin: 0 auto;
 		background: lightgray;
 	}
 	
 	header {
 		background: #DED842;
 		width: 100%;
 		height: 9%;
 	}
 	
 	#topAreaT {
 		width: 70%;
 		height: 100%;
 		margin: 0 auto;
 		float: left;
 		margin-left: 20px;
 	}
 	
 	#topAreaT tr > td {
 		color: #4E4E4E;
 		font-size: 20px;
 		font-weight: bold;
 		
 	}
 	
 	#topAreaT tr > td:nth-child(1) {
 		font-size: 45px;
 		font-family: 'ZCOOL QingKe HuangYou', cursive;
 	}
 	
 	#logoutT {
 		margin: 0 auto;
 		padding-top: 20px;
 		width: 340px;
 		height: 100%;
 	}
 	
 	#logout {
 		border-style: 1px solid #4E4E4E;
 		color: #4E4E4E;
 		background: #DED842;
 		padding-left: 10px;
 		padding-right: 10px;
        border-top-left-radius:50px;
        border-bottom-left-radius: 50px;
        border-top-right-radius: 50px;
        border-bottom-right-radius: 50px; 
        font-size: 17px;
 	}
</style>
</head>
<body>
<header>
		<table id="topAreaT">
			<tr style="text-align: right;">
				<td style="text-align: left; cursor:pointer">hobbyist</td>
				<td id="adminMember" style="cursor:pointer">회원관리</td>
				<td id="adminBoard" style="cursor:pointer">게시판관리</td>
				<td style="cursor:pointer">수업관리</td>
				<td style="cursor:pointer">신고/문의</td>
				<td id="adminPayment" style="cursor:pointer">결제/환불</td>
				<td style="width: 90px;" style="cursor:pointer">통계</td>
			</tr>
		</table>
		<table id="logoutT">
			<tr>
				<td style="text-align: right; width: 30px; cursor:pointer"><button id="logout">로그아웃</button></td>
			</tr>
		</table>
	</header>
	<script>
		document.getElementById("logout").onclick = function (){

			location.href = "<%=request.getContextPath()%>/logout.ad";
		};
		
		$("#adminMember").click(function() {
			location.href = "<%=request.getContextPath()%>/views/admin/memberMgmt/memberList.jsp";
		});
		
		$("#adminBoard").click(function() {
			location.href = "<%=request.getContextPath()%>/adminPlaceList.ad";
		});
		
		$("#adminPayment").click(function() {
			location.href = "<%=request.getContextPath()%>/views/admin/payRefundMgmt/payList.jsp";
		});
		
	</script>
</body>
</html>