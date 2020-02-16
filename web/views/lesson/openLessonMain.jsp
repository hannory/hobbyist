<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://fonts.googleapis.com/css?family=Do+Hyeon|ZCOOL+QingKe+HuangYou&display=swap"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style>
#middle {
	height: 520px;
	top: 80px;
	background-image: url("/hobbyist/static/images/musicLesson.jpg");
	background-size: 100% 100%;
	background-repeat: no-repeat;
}

#middleInfo {
	margin: auto;
	font-family: 'Do Hyeon', sans-serif;
	font-weight: lighter;
	font-size: 40px;
	color: white;
}

#middle-mid {
	height: 50%;
	width: 50%;
	vertical-align: auto;
	margin: auto;
}

#middleComment {
	color: white;
	text-shadow:1px 1px dimgrey;
}

#middleInfo td div {
	margin: auto;
	font-family: 'ZCOOL QingKe HuangYou', cursive;
	color: darkolivegreen;
	font-size: 50px;
	background-color: white;
	height: 60px;
	line-height: 60px;
	text-align: center;
	width: 200px;
}

#middleInfo button {
	height: 50px;
	width: 300px;
	font-family: 'Do Hyeon', sans-serif;
	font-size: 20px;
	color: white;
	padding: 5px;
	border: 1px solid darkolivegreen;
	background-color: darkolivegreen;
}

#middleBtnArea {
	
}

#bottomInfo {
	width: 1024px;
	text-align: center;
	margin: auto;
	border-spacing: 15px;
	border-collapse: separate;
}

#bottomInfo #first {
	font-size: 25px;
	font-family: 'Do Hyeon', sans-serif;
	color: darkolivegreen;
}

#bottomInfo #second {
	font-size: 20px;
	font-family: 'Do Hyeon', sans-serif;
	color: #BE9524;
}

#bottomInfo #third {
	font-size: 20px;
	font-family: 'Do Hyeon', sans-serif;
	color: darkolivegreen;
}

#bottomInfo #fourth {
	font-size: 15px;
}

#ArtistTable1 {
	font-size: 20px;
	font-family: 'Do Hyeon', sans-serif;
	border-spacing: 20px;
	width: 100%;
}

#ArtistTable1  td {
	width: 20%;
	color: #A7A1A1;
}

#ArtistTable1  td:first-child {
	color: darkolivegreen;
}

#ArtistTable2 {
	color: darkolivegreen;
	font-family: 'Do Hyeon', sans-serif;
	font-size: 17px;
	border-spacing: 15px;
	border-collapse: separate;
	width: 100%;
	height: 400px;
}

#ArtistTable2 td {
	display: table-cell;
	vertical-align: top;
}

#ArtistTable2 button {
	background: darkolivegreen;
	color: white;
	padding: 5px;
	border: 1px solid darkolivegreen;
	font-family: 'Do Hyeon', sans-serif;
}

#myModalLabel {
	font-family: 'Do Hyeon', sans-serif;
	font-size: 20px;
}

#ArtistDiv3 {
	font-size: 30px;
	font-family: 'Do Hyeon', sans-serif;
	color: darkolivegreen;
}

#ArtistTable3 {
	font-size: 20px;
	font-family: 'Do Hyeon', sans-serif;
	border-spacing: 20px;
	width: 100%;
}

#btn-all {
	font-family: 'Helvetica Neue', Hevetica, Arial, sans-serif;
	font-size : 12px;
}

#ArtistTable3 td {
	width: 130px;
	color: #A7A1A1;
	width: 20%;
}

#ArtistTable3 td:nth-child(2) {
	color: darkolivegreen;
}

#ArtistTable4 {
	color: darkolivegreen;
	font-family: 'Do Hyeon', sans-serif;
	font-size: 20px;
	border-spacing: 30px;
	border-collapse: separate;
}

.item {
    border-radius: 8px;
    background-color: lightgray;
    color: black;
    padding: 5px;
    font-size: 15px;
}

#ArtistTable5 {
	font-size: 20px;
	font-family: 'Do Hyeon', sans-serif;
	border-spacing: 20px;
	width: 100%;
}

#ArtistTable5  td {
	width: 130px;
	color: #A7A1A1;
	width: 20%;
}

#ArtistTable5  td:nth-child(3) {
	color: darkolivegreen;
}

#ArtistTable6 {
	border-spacing: 15px;
	border-collapse: separate;
}

#ArtistTable6 td {
	width: 30px;
	font-family: 'Do Hyeon', sans-serif;
	font-size: 20px;
}

#ArtistTable7 {
	font-size: 20px;
	font-family: 'Do Hyeon', sans-serif;
	border-spacing: 20px;
	width: 100%;
}

#ArtistTable7  td {
	width: 130px;
	color: #A7A1A1;
	width: 20%;
}

#ArtistTable7  td:nth-child(4) {
	color: darkolivegreen;
}

#ArtistTable8 {
	/* border: 1px solid black; */
	border-spacing: 15px;
	border-collapse: separate;
}

#ArtistTable8 td {
	width: 30px;
	font-family: 'Do Hyeon', sans-serif;
	font-size: 20px;
}

#ArtistTable9 {
	font-size: 20px;
	font-family: 'Do Hyeon', sans-serif;
	border-spacing: 20px;
}

#ArtistTable9  td {
	width: 130px;
	color: #A7A1A1;
}

#ArtistTable9  td:nth-child(5) {
	color: darkolivegreen;
}

#ArtistTable10 {
	/* border: 1px solid black; */
	border-spacing: 15px;
	border-collapse: separate;
}

#ArtistTable10 td {
	width: 30px;
	/* font-family: 'Do Hyeon', sans-serif; */
	/* border:1px solid black; */
}
</style>
</head>
<body>
	<%@ include file="../common/menubar.jsp"%>
	<div id="middle">
		<table id="middleInfo">
			<tr>
				<td>&nbsp;
					<div>hobbyist</div>
				</td>
			</tr>
			<tr>
				<td id="middleComment">갖고계신 재능을 공유할<br>수업을 개설해주세요.
				</td>
			</tr>
			<tr>
				<td id="middleBtnArea" style="height: 400px;">
					<button type="button" class="btn btn-primary btn-lg"
						id="openModalBtn" style="margin-left:15px;">수업 개설하기</button>
				</td>
			</tr>
		</table>

	</div>
	<div id="bottom">
		<!-- 4행 3열-->
		<table id="bottomInfo">
			<tr>
				<td id="first" colspan="3">수업 개설 어떻게 진행되나요?</td>
			</tr>
			<tr>
				<td id="second" width="33%">STEP.01</td>
				<td id="second" width="33%">STEP.02</td>
				<td id="second">STEP.03</td>
			</tr>
			<tr>
				<td id="third">수업 기본정보 입력</td>
				<td id="third">아티스트 정보 확인</td>
				<td id="third">수업 소개 및 일정등록</td>
			</tr>
			<tr>
				<td id="fourth">카데고리, 수업제목, 인원, 수업료, 이미지 등을 등록합니다.</td>
				<td id="fourth">기존 등록하신 자격, 경력, 아티스트 소개를 확인하고 수업에 맞게 수정합니다.</td>
				<td id="fourth">수업 소개를 작성하시고, 원하시는 일정을 회차에 맞게 등록해주시면 신청이 완료됩니다.</td>
			</tr>
		</table>
	</div>

	<!-- modalBox 시작 부분 -->
	<div id="modalBox" class="modal fade" id="myModal" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document" style="width: 780px;">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">수업개설하기</h4>
				</div>
				<div class="modal-body">
					<form id="artistForm"
						action="<%= request.getContextPath() %>/insert.ar" method="post">
						<div id="show1">
							<table id="ArtistTable1">
								<tr>
									<td>01. 기본정보</td>
									<td>02. 자격/경력</td>
									<td>03. 아티스트소개</td>
									<td>04. 수업소개</td>
									<td>05. 일정등록</td>
								</tr>
							</table>
							<table id="ArtistTable2">
								<tr>
									<td style="width: 33%">
										<div>카데고리</div>
										<div>
											<select name="category" style="color:black;">
												<option value="music">음악</option>
												<option>댄스</option>
												<option>영상/사진</option>
												<option>라이프스타일</option>
												<option>뷰티</option>
												<option>디자인</option>
												<option>스포츠</option>
											</select>
										</div>
									</td>
									<td colspan="2">
										<div>수업제목</div>
										<div>
											<input type="text" style="width:400px;">
										</div>
										<div>0/50</div>
									</td>
								</tr>
								<tr>
									<td>
										<div>상세 카테고리</div> <select name="subCategory" style="color:black;">
											<option value="music">음악</option>
											<option>댄스</option>
											<option>영상/사진</option>
											<option>라이프스타일</option>
											<option>뷰티</option>
											<option>디자인</option>
											<option>스포츠</option>
									</select>
									</td>
									<td>
										<div>수업 최소인원</div> <select name="subCategory" style="color:black;">
											<option value="music">음악</option>
											<option>댄스</option>
											<option>영상/사진</option>
											<option>라이프스타일</option>
											<option>뷰티</option>
											<option>디자인</option>
											<option>스포츠</option>
									</select>
									</td>
									<td>
										<div>수업 최대인원</div> <select name="subCategory" style="color:black;">
											<option value="music">음악</option>
											<option>댄스</option>
											<option>영상/사진</option>
											<option>라이프스타일</option>
											<option>뷰티</option>
											<option>디자인</option>
											<option>스포츠</option>
									</select>
									</td>
								</tr>
								<tr>
									<td style="vertical-align: bottom;">이미지 업로드</td>
									<td>
										<div>총 회차</div> <select name="subCategory" style="color:black;">
											<option value="music">음악</option>
											<option>댄스</option>
											<option>영상/사진</option>
											<option>라이프스타일</option>
											<option>뷰티</option>
											<option>디자인</option>
											<option>스포츠</option>
									</select>
									</td>
									<td>
										<div>회차당 비용</div> <select name="subCategory" style="color:black;">
											<option value="music">음악</option>
											<option>댄스</option>
											<option>영상/사진</option>
											<option>라이프스타일</option>
											<option>뷰티</option>
											<option>디자인</option>
											<option>스포츠</option>
									</select>
									</td>
								</tr>
								<tr>
									<td colspan="3">
										<img src="<%= request.getContextPath() %>/static/images/iphoneCamera.png" width="80px" height="80px">
										<img src="<%= request.getContextPath() %>/static/images/iphoneCamera.png" width="80px" height="80px">
										<img src="<%= request.getContextPath() %>/static/images/iphoneCamera.png" width="80px" height="80px">
										<img src="<%= request.getContextPath() %>/static/images/iphoneCamera.png" width="80px" height="80px">
									</td>
								</tr>
							</table>
						</div>
						<div id="show2" style="display: none;">
							<table id="ArtistTable3">
								<tr>
									<td>01. 기본정보</td>
									<td>02. 자격/경력</td>
									<td>03. 아티스트소개</td>
									<td>04. 수업소개</td>
									<td>05. 일정등록</td>
								</tr>
							</table>
							<table id="ArtistTable4">
		                        <tr height="20px">
		                            <td colspan="2" style="width:90%">
		                                <span style="color:black">보유한 기술</span>&nbsp;&nbsp;<span style="color:#A7A1A1">(해당 수업정보에 노출시킬 기술을 선택하세요)</span>
		                            </td>
		                            <td style="width:10%">
		                                <button type="button" id="btn-all" class="btn btn-primary">전체선택</button>
		                            </td>
		                        </tr>
		                        <tr>
		                            <td colspan="3">
		                                <span class="item">커피 바리스타 자격증 1급</span>
		                            </td>
		                        </tr>
		                        <tr height="20px">
		                            <td colspan="2">
		                                <span style="color:black">등록한 경력</span>&nbsp;&nbsp;<span style="color:#A7A1A1">(해당 수업정보에 노출시킬 기술을 선택하세요)</span>
		                            </td>
		                            <td>
		                                <button type="button" id="btn-all" class="btn btn-primary">전체선택</button>
		                            </td>
		                        </tr>
		                        <tr>
		                            <td colspan="3">
		                                 <span class="item">스타벅스 매니저 / 3년 2개월</span>
		                            </td>
		                        </tr>
		                    </table>
						</div>
						<div id="show3" style="display: none;">
							<table id="ArtistTable5">
								<tr>
									<td>01. 기본정보</td>
									<td>02. 자격/경력</td>
									<td>03. 아티스트소개</td>
									<td>04. 수업소개</td>
									<td>05. 일정등록</td>
								</tr>
							</table>
							<table id="ArtistTable6">
								<tr>
		                            <td>
		                                <span style="color:black">아티스트소개</span>&nbsp;&nbsp;<span style="color:#A7A1A1">수정이 필요하면 수정해주세요</span>
		                            </td>
								</tr>
								<tr>
									<td>
										<textarea name="introduce" rows="5" cols="40"
												style="width: 380px; height: 200px; text-align: left; color: rgb(49, 49, 49);"></textarea>
										<div>0/400</div>
									</td>
								</tr>
							</table>
						</div>
						<div id="show4" style="display: none;">
							<table id="ArtistTable7">
								<tr>
									<td>01. 기본정보</td>
									<td>02. 자격/경력</td>
									<td>03. 아티스트소개</td>
									<td>04. 수업소개</td>
									<td>05. 일정등록</td>
								</tr>
							</table>
							<table id="ArtistTable8">
								<tr>
		                            <td style="width:100%;">
		                                <span style="color:black">수업소개</span>&nbsp;&nbsp;<span style="color:#A7A1A1">수업에 대한 소개와 커리큘럼을 적어주세요</span>
		                            </td>
								</tr>
								<tr>
									<td>
										<textarea name="introduce" rows="5" cols="40"
												style="width: 380px; height: 200px; text-align: left; color: rgb(49, 49, 49);"></textarea>
										<div>0/400</div>
									</td>
								</tr>
							</table>
						</div>
						<div id="show5" style="display: none;">
							<table id="ArtistTable9">
								<tr>
									<td>01. 자기소개</td>
									<td>02. 전문분야</td>
									<td>03. 보유 자격증</td>
									<td>04. 학력/전공</td>
									<td>05. 경력</td>
								</tr>
							</table>
							<table id="ArtistTable10">
								<tr>
									<td colspan="2" style="font-family: 'Do Hyeon', sans-serif;">경력사항을
										작성해주세요.&nbsp;&nbsp; <label
										style="color: darkolivegreen; font-size: 13px;">선택 사항</label>
									</td>
								</tr>
								<tr>
									<td><input type="text" placeholder="기관명"
										style="width: 170px; height: 30px;"></td>
									<td><input type="text" placeholder="직위"
										style="width: 170px; height: 30px;"></td>
								</tr>
								<tr>
									<td colspan="2"><input type="text"
										placeholder="전공(ex. 컴퓨터공학과)"
										style="width: 352px; height: 30px;"></td>

								</tr>
								<tr>
									<td colspan="2" style="font-family: 'Do Hyeon', sans-serif;">근무기간</td>
								</tr>
								<tr>
									<td><select style="width: 170px; height: 30px;">
											<option>년도</option>
									</select></td>
									<td><select style="width: 170px; height: 30px;">
											<option>월</option>
									</select></td>
								</tr>
								<tr>
									<td></td>
								</tr>
								<tr>
									<td colspan="2"><button
											style="width: 352px; border-color: darkolivegreen; color: darkolivegreen; font-family: 'Do Hyeon', sans-serif;">확인</button></td>
								</tr>
							</table>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" id="closeModalBtn">이전</button>
					<button type="button" class="btn btn-primary" id="nextModalBtn">다음</button>
					<button type="button" class="btn btn-primary" id="saveModalBtn"
						style="display: none;">저장</button>
				</div>
			</div>
		</div>
	</div>
	<script>
		$(function(){
			var num = 1;
			// 모달 버튼에 이벤트를 건다.
			$('#openModalBtn').on('click', function() {
				$('#modalBox').modal('show');
			});
			// 모달 안의 취소 버튼에 이벤트를 건다.
			$('#closeModalBtn').on('click', function() {
				/* $('#modalBox').modal('hide'); */
				if(num > 1) {
					$("#show"+ num).hide();
					console.log(num);
					num--;
					$("#show"+ num).show();
					console.log(num);
					
				}
				if(num < 5) {
					$("#nextModalBtn").show();
					$("#saveModalBtn").hide();
				}
			});
			$('#nextModalBtn').on('click', function() {

				$("#show"+ num).hide();
				console.log(num);
				num++;
				$("#show"+ num).show();
				console.log(num);
				if(num == 5){
					$("#nextModalBtn").hide();
					$("#saveModalBtn").show();
				} 
	
			});
			$('#saveModalBtn').on('click', function() {
				$("#artistForm").submit();
			});
		});
	</script>
	<div style="height:30px;"></div>
	<%@ include file="../common/footer.jsp"%>
</body>
</html>