<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css?family=Roboto&display=swap" rel="stylesheet">
<style>
	
		
	
        #contents {
        	/* margin:auto;
        	 width:1024px; */ 
    		margin-top:-40px;
        	background-image:url("images/resize_main.jpg");
        	background-size:100% 100%;
        	background-repeat: no-repeat;
        }
       
       p {
       		padding-top:230px;
       		padding-left:50px;
       		color:white;
       		font-family: 'Do Hyeon', sans-serif;
       		font-size:52px;
       } 
       #nav {
       		
       		height:100px;
       		width:1024px;
       		margin:auto;
       		margin-top:-55px;
       		
       }
       .icon {
       		width:50px;
       		height:50px;
       		 margin-top:15px; 
       		/* display:inline-block;*/
      		margin:35px;
      		margin-top:15px;
      		margin-bottom:5px;
      		align:center; 
       }
       #line {
       		border-top:2.5px solid darkolivegreen;	
    		height:3px;
       }
       
       .nLabel {
       		font-family: 'Do Hyeon', sans-serif;
       		font-size:15px;
       		color:darkolivegreen;
       		text-align:center;
       		
       }
       
       #section {
       		width:1024px;
       		height:900px;
       		margin:auto;
       }
       
       #aside {
       		margin-top:-52px;
       		width:170px;
       		border-right:1px solid darkolivegreen;
       		height:300px;
       }
      
       
       #lesson1 {
       		margin-top:-180px;
       		 margin-left:200px; 
       		font-size:12px;
       		width:210px;
       		height:270px;
       		border:1px solid darkolivegreen;
       }
       
       #lesson1 table img {
       		border-radius:100px 100px 100px 100px;
       		width:50px;
       		height:50px;
       }
       #lesson1 table td:nth-of-type(2n) {
       		float:right;	
       }
       #lLabel {
       		margin-top:500px;
       		margin-left:550px;
       		font-family: 'Do Hyeon', sans-serif;
       		/* font-weight:900; */
       		font-size:25px;
       		color:darkolivegreen;
       		align:center;
       }
     
</style>
</head>
<body>
	<%@ include file="views/common/menubar.jsp" %>
	<div id="main">
	 <div id="contents">
    	<p>2020년 첫 시작,<br>
    	취미는 <label style="color:darkolivegreen; font-family: 'ZCOOL QingKe HuangYou', cursive; font-weight:900">hobbyist  </label> 에서!</p>
    </div>
   <div id="nav">
	<table align="center">
   	<tr>
   		<td><img src="images/music.png" class="icon"></td>
   		<td><img src="images/dance.png" class="icon"></td>
   		<td><img src="images/video.png" class="icon"></td>
   		<td><img src="images/life.png" class="icon"></td>
   		<td><img src="images/beauty.png" class="icon"></td>
   		<td><img src="images/design.png" class="icon"></td>
   		<td><img src="images/sports.png" class="icon"></td>
   		<td><img src="images/space.png" class="icon"></td>
   	</tr>
   	<tr>
   		<td class="nLabel">음악</td>
   		<td class="nLabel">댄스</td>
   		<td class="nLabel">영상/사진</td>
   		<td class="nLabel">라이프스타일</td>
   		<td class="nLabel">뷰티</td>
   		<td class="nLabel">디자인</td>
   		<td class="nLabel">스포츠</td>
   		<td class="nLabel">공간대여</td>
   	</tr>
   </table>
   </div>
   
   <div id="line"></div>
   <div id="section">
   <label id="lLabel">인기수업</label>
   	<div id="aside">
   		<ul style="list-style:none; line-height:300%; font-family: 'Do Hyeon', sans-serif; font-size:18px; color:darkolivegreen; padding-top:20px;">
   			<li>관심수업</li>
   			<li>인기수업</li>
   			<li>신규아티스트수업</li>
   		</ul>
   	</div>
    <div class="lesson-list" id="lesson1">
   <img src="images/coffee.jpg" width="210px" height="150px">
   <table >
   	<tr>
   		<td colspan="2">[카페,커피] 2시간이면 나도 바리스타!</td>
   	</tr>
   	<tr>
   		<td></td>
   		<td><img src="images/jae.png"></td>
   	</tr>
   	<tr>
   		<td>(15)</td>
   		<td>재현쌤</td>
   	</tr>
   	<tr>
   		<td>평택</td>
   		<td>재현</td>
   	</tr>
   </table>    
   </div> 
   
   
   </div>
   </div>
  
	<%@ include file="views/common/footer.jsp" %>
</body>
</html>