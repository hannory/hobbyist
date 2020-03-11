<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String successCode = (String) request.getAttribute("successCode"); %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
	<script>
		$(function() {
			var successCode = '<%=successCode%>';
			var alertMessage = "";
			var movePath = "";
			
			switch(successCode) {
				case "refuseRefund" :
					alertMessage = "반려처리가 성공적으로 이루어 졌습니다.";
					movePath = "/hobbyist/views/admin/payRefundMgmt/applyRefundList.jsp";
					break;
				
				case "cancelRefuse" :
					alertMessage = "반려취소 처리가 성공적으로 이루어 졌습니다.";
					movePath = "/hobbyist/views/admin/payRefundMgmt/payList.jsp";
					break;
				
				case "approveRefund" :
					alertMessage = "환불이 성공적으로 완료되었습니다.";
					movePath = "/hobbyist/views/admin/payRefundMgmt/applyRefundList.jsp"
					break;
			}
			
			alert(alertMessage);
			location.href = movePath;
		});
	</script>
</body>
</html>