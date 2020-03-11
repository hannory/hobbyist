<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.dh.hobbyist.payment.model.vo.RegisterPayment"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.sql.Timestamp" %>
<%
	ArrayList<RegisterPayment> pList = (ArrayList<RegisterPayment>) request.getAttribute("pList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/eun-css.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<title>Insert title here</title>
<style>
	#payListDiv {
		width: 1024px;
		height: 400px;
		text-align: center;
		margin: 0 auto;
		margin-bottom: 150px;
		overflow-x: hidden;
        overflow-y: auto;
	}
	
	#payListTable, #payListTable1 {
		width: 1024px;;
		margin-top: 10px;
		line-height: 30px;
		text-align: center;
	}
	
	#paySubMenu {
		width: 1024px;
		font-family: Do Hyeon;
		font-size: 22px;
		margin-top:5px;
		margin: 0 auto;
	}
	#paySubMenu tr:nth-child(1) td {
		text-align: left;
		padding-top: 10px;
	}
	
	#payListTable1 {
		border: 1px solid darkolivegreen;
	}
</style>
</head>
<body>
	<%@include file="/views/common/myPage.jsp" %>
	<table id="paySubMenu">
			<tr>
				<td style="padding-left: 30px;"><label id="showPayList" style="color:darkolivegreen;">결제 내역</label></td>
				<td><label id="showRefundList">환불 내역</label></td>
				<td><label id="showPointList">포인트 사용 내역</label></td>
				<td style="width:470px;"></td>
			</tr>
			<tr>
				<td colspan="4"><hr></td>
			</tr>
		</table>
	<br clear="both">
	<div id="payListDiv">
		<table id="payListTable1">
			<tr>
				<th style="width: 400px;">수업정보</th>
				<th style="width: 140px;">아티스트 닉네임</th>
				<th style="width: 150px;">결제일자</th>
				<th style="width: 150px;">결제금액</th>
				<th>수강상태</th>
			</tr>
		</table>
		<table id="payListTable">
			<% for(RegisterPayment p : pList) { %>
			<tr>
				<td style="font-weight: bold; font-size: 17px; width: 400px;"><%=p.getLessonName() %></td>
				<td style="width: 140px;"><%=p.getArtistName() %></td>
				<td style="width: 150px;"><%=(p.getPaymentDate().toString()).substring(0, 16) %></td>
				<td style="width: 150px;"><%=p.getPayCost() %></td>
			
				<%if(p.getStartDate().getTime() > p.getNow().getTime()) {%>
				<td style="color: gray">수강대기</td>
				<%}else if(p.getStartDate().getTime() < p.getNow().getTime() && p.getNow().getTime() < p.getEndDate().getTime()) {%>
				<td style="color: green">수강 중</td>
				<%}else if(p.getNow().getTime() > p.getEndDate().getTime()){ %>
				<td style="color: red">종료</td>
				<%} else if(p.getStatus() == 3){ %>
				<td style="color: red">일정 삭제</td>
				<%} %>
			
			</tr>
			<% } %> 
		</table>
	</div>
	<%@ include file="/views/common/footer.jsp"%>
	<script>
		$("#showRefundList").click(function() {
			location.href = "<%=request.getContextPath()%>/refundList.me";
		});
		
		$("#showPointList").click(function() {
			location.href = "<%=request.getContextPath()%>/pointList.me";
		});
	</script>
</body>
</html>