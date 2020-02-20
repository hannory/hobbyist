<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style>
	#wrapTable {
		border: 1px solid black;
		margin: 0 auto;
	}
	
	#wrapTable td {
		border: 1px solid black;
	}
	
	#carouselTd {
		/* width: 612px; */
		
	}
	
	.container {
		width: 612px;
		height: 400px;
	}

/* carousel 관련 CSS */
	.carousel-inner > .item > img,
	.carousel-inner > .item > a > img {
    	width: 70%;
    	margin: auto;
	}
</style>
</head>
<body>
<%@ include file="../common/categorybar.jsp" %>


<table id="wrapTable">
	<tr>
		<td id="carouselTd" colspan="2" rowspan="4">
			<!-- carousel 영역 -->
			<div class="container">
			  <br>
			  <div id="myCarousel" class="carousel slide" data-ride="carousel">
			    <!-- Indicators -->
			    <ol class="carousel-indicators">
			      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			      <li data-target="#myCarousel" data-slide-to="1"></li>
			      <li data-target="#myCarousel" data-slide-to="2"></li>
			      <li data-target="#myCarousel" data-slide-to="3"></li>
			    </ol>
			
			    <!-- Wrapper for slides -->
			    <div class="carousel-inner" role="listbox">
			
			      <div class="item active">
			        <img src="img_chania.jpg" alt="Chania" width="460" height="345">
			        <!-- <div class="carousel-caption">
			          <h3>Chania</h3>
			          <p>The atmosphere in Chania has a touch of Florence and Venice.</p>
			        </div> -->
			      </div>
			
			      <div class="item">
			        <img src="img_chania2.jpg" alt="Chania" width="460" height="345">
			      </div>
			    
			      <div class="item">
			        <img src="img_flower.jpg" alt="Flower" width="460" height="345">
			      </div>
			
			      <div class="item">
			        <img src="img_flower2.jpg" alt="Flower" width="460" height="345">
			      </div>
			  
			    </div>
			
			    <!-- Left and right controls -->
			    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
			      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
			      <span class="sr-only">Previous</span>
			    </a>
			    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
			      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			      <span class="sr-only">Next</span>
			    </a>
			  </div>
			</div>
			<!-- carousle 영영 끝 -->
		</td>
		<td></td>
		<td></td>
	</tr>
		<td colspan="2"></td>
	<tr>
		<td colspan="2"></td>
	</tr>
	<tr>
		<td colspan="2"></td>
	</tr>
	<tr>
		<td colspan="2"></td>
	</tr>
</table>


</body>
</html>