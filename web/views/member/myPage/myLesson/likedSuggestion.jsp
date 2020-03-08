<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList, com.dh.hobbyist.suggest.model.vo.Petition, com.dh.hobbyist.suggest.model.vo.PageInfo"%>
<%
	ArrayList<Petition> myWishList = (ArrayList<Petition>) request.getAttribute("myWishList");
	PageInfo pi = (PageInfo) request.getAttribute("pi");
	int listCount = pi.getListCount();
	int currentPage = pi.getCurrentPage();
	int maxPage = pi.getMaxPage();
	int startPage = pi.getStartPage();
	int endPage = pi.getEndPage();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	#likedSugDiv1 {
		width:1024px;
		margin:auto;
	}
	#regSugTab1 {
		width:100%;
		font-family: Do Hyeon;
		font-size: 22px;
		margin-top:5px;
	}
	#regSubTab1 td {
		width:130px;
	}
	.Center_button1 {
		color:darkolivegreen;
	}
	.regSugLab {
		cursor:pointer;
	}
	.likedSubList {
		width: 220px;
		border: 1px solid white;
		display: inline-block;
		margin: 10px;
	}
	#likedSubTab2 {
		border: 1.5px solid darkolivegreen;
		border-radius:5px;
		height: 160px;
	}
	#MyWishListArea {
		width:1000px;
		margin-left: 15px;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<title>hobbyist</title>
</head>
<body>
	<%@ include file="/views/common/myPage.jsp" %>
	<div id="likedSugDiv1">
		<table id="regSugTab1">
			<tr>
				<td onclick="goRegLes();" style="text-align:center;"><label class="regSugLab">수강한 수업</label></td>
				<td style="text-align:center;"><label class="regSugLab">찜한 수업</label></td>
				<td onclick="goRegSug();" style="text-align:center;"><label class="regSugLab">등록한 건의</label></td>
				<td onclick="goLikedSug();" style="color:darkolivegreen; text-align:center;"><label class="regSugLab">찜한 건의</label></td>
				<td style="text-align:center;"><label class="regSugLab">개설한 수업</label></td>
				<td style="width:374px;"></td>
			</tr>
			<tr>
				<td colspan="6"><hr></td>
			</tr>
		</table>
		<script>
			function goRegLes() {
				location.href = "<%=request.getContextPath()%>/selectMyRegi.le";
			}
			function goLikedSug() {
				location.href = "<%=request.getContextPath()%>/selectMyWishList.sg";
			}
			function goRegSug() {
				location.href = "<%=request.getContextPath()%>/selectMyList.sg";				
			}
		</script>
		<br>
		<div id="MyWishListArea">
			<% for(Petition p : myWishList) { %>
				<div class="likedSubList">
					<input type="hidden" value="<%=p.getPetitionCode() %>">
					<table id="likedSubTab2">
						<tr>
							<td colspan="2"><%=p.getTitle() %></td>
							<td style="width: 70px;"></td>
						</tr>
						<tr>
							<td colspan="2"></td>
							<td rowspan="2" style="text-align: right;">
								<% if(p.getCategoryParentCode() == 1) { %>
								 	<img src="/hobbyist/static/images/music.png" style="width:50px; height:50px;">
								<%} else if(p.getCategoryParentCode() == 9) { %>
									<img src="/hobbyist/static/images/dance.png" style="width:50px; height:50px;">
								<%} else if(p.getCategoryParentCode() == 15) { %>
									<img src="/hobbyist/static/images/video.png" style="width:50px; height:50px;">
								<%} else if(p.getCategoryParentCode() == 20) { %>
									<img src="/hobbyist/static/images/life.png" style="width:50px; height:50px;">
								<%} else if(p.getCategoryParentCode() == 25) { %>
									<img src="/hobbyist/static/images/beauty.png" style="width:50px; height:50px;">
								<%} else if(p.getCategoryParentCode() == 33) { %>
									<img src="/hobbyist/static/images/design.png" style="width:50px; height:50px;">
								<%} else if(p.getCategoryParentCode() == 37) { %>
									<img src="/hobbyist/static/images/sports.png" style="width:50px; height:50px;">
								<%} %>
							</td>
						</tr>
						<tr>
							<td><img src="/hobbyist/static/images/heart.png" style="width:20px; height:20px;"> (<%=p.getWishlisted() %>)</td>
							<td><img src="/hobbyist/static/images/dialogicon.png" style="width:20px; height:20px"> (<%=p.getReplyCount() %>)</td>
						</tr>
						<tr>
							<td colspan="2"><%=p.getLocation() %>/<%=p.getNumOfStudents() %></td>
							<td style="text-align:right; color:darkolivegreen; font-weight:bold;"><%=p.getMemberName() %></td>
						</tr>
					</table>
				</div>
			<% } %>
		
		</div>
		<!-- <div class="likedSubList">
			<table id="likedSubTab2">
				<tr>
					<td colspan="2">의정부시 농구 수업</td>
					<td style="width: 70px;"></td>
				</tr>
				<tr>
					<td colspan="2"></td>
					<td rowspan="2" style="text-align: right;"><img
						src="/hobbyist/static/images/sports.png"
						style="width: 50px; height: 50px;"></td>
				</tr>
				<tr>
					<td><img src="/hobbyist/static/images/heart.png"
						style="width: 20px; height: 20px;"> (10)</td>
					<td><img src="/hobbyist/static/images/dialogicon.png"
						style="width: 20px; height: 20px"> (8)</td>
				</tr>
				<tr>
					<td colspan="2">당산|저녁반|2~4명</td>
					<td
						style="text-align: right; color: darkolivegreen; font-weight: bold;">이지호</td>
				</tr>
			</table>
		</div>
		<div class="likedSubList">
			<table id="likedSubTab2">
				<tr>
					<td colspan="2">의정부시 농구 수업</td>
					<td style="width: 70px;"></td>
				</tr>
				<tr>
					<td colspan="2"></td>
					<td rowspan="2" style="text-align: right;"><img
						src="/hobbyist/static/images/sports.png"
						style="width: 50px; height: 50px;"></td>
				</tr>
				<tr>
					<td><img src="/hobbyist/static/images/heart.png"
						style="width: 20px; height: 20px;"> (10)</td>
					<td><img src="/hobbyist/static/images/dialogicon.png"
						style="width: 20px; height: 20px"> (8)</td>
				</tr>
				<tr>
					<td colspan="2">당산|저녁반|2~4명</td>
					<td
						style="text-align: right; color: darkolivegreen; font-weight: bold;">이지호</td>
				</tr>
			</table>
		</div>
		 -->
		
		<br><br>
		<div class="likedSugPagingArea" align="center">
			<button onclick="location.href='<%=request.getContextPath() %>/selectMyList.sg?currentPage=1'"><<<</button>
			
			<%if(currentPage <= 1) { %>
				<button disabled><</button>
			<%} else { %>
				<button onclick="location.href='<%=request.getContextPath()%>/selectMyList.sg?currentPage=<%=currentPage -1%>'"><</button>
			<%} %>
			
			<% for(int p = startPage; p <= endPage; p++) {
					if(p == currentPage) {	
			%>
					<button disabled><%= p %></button>
			
			<% 		} else {
			%>
					
					<button onclick="location.href='<%=request.getContextPath()%>/selectMyList.sg?currentPage=<%=p%>'"><%= p %></button>
			
			<%		}
				}
			%>
			<%if(currentPage >= maxPage) { %>
				<button disabled>></button>
			<%} else { %>
				<button onclick="location.href='<%=request.getContextPath() %>/selectMyList.sg?currentPage=<%=currentPage+1 %>'">></button>
			<% } %>
			<button onclick="location.href='<%=request.getContextPath()%>/selectMyList.sg?currentPage=<%=maxPage%>'">>>></button>	
		</div>
	</div>
	<br><br><br><br>
	<%@ include file="/views/common/footer.jsp"%>
	<script>
		$(function() {
			$(".likedSubList").click(function() {
				var num = $(this).children("input").val();
				
				location.href = "<%=request.getContextPath()%>/selectOne.sg?num=" + num;
			});
		});
	</script>
</body>
</html>