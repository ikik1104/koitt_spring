<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="css/join.css">
		<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
        <script type="text/javascript" src="js/jquery-ui.min.js"></script>
        <script type="text/javascript" src="js/join.js"></script>
        <script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
		<script type="text/javascript" src="js/postcode_v2.js"></script>
	</head>
	<body>
		<!-- 헤더 -->
<jsp:include page="header.jsp"/>
		<div id="sub_img"></div>
		<form name="join" action="joinInsert" method="post">
		<section>
			<div>
				<div id="top">
					<ul>
						<li>HOME</li>
						<li>회원가입</li>
						<li>회원정보입력</li>
					</ul>
				</div>
				<div id="title">
					<h3>회원가입</h3>
				</div>
				<div id="step">
					<ul>
						<li>
						<div>
							<span>STEP.1</span>
							<p>약관동의</p>
						</div>
						</li>
						<li>
						<div>
							<span>STEP.2</span>
							<p>본인확인</p>
						</div>
						</li>
						<li>
						<div>
							<span>STEP.3</span>
							<p>회원정보입력</p>
						</div>
						</li>
						<li>
						<div>
							<span>STEP.4</span>
							<p>회원관리완료</p>
						</div>
						</li>
					</ul>
				</div>
				<h3>필수 정보 입력<span>( * 항목은 필수 항목입니다.)</span></h3>
				
				<table>
					<tr>
						<th><span></span>이름</th>
						<td>
							${dto.name}
						</td>
					</tr>
					<tr>
						<th><span></span>아이디</th>
						<td>
							${dto.id}
						</td>
					</tr>
					<tr>
						<th><span></span>비밀번호</th>
						<td>
							${dto.pw}
						</td>
					</tr>
					<tr>
						<th><span></span>이메일</th>
						<td>
							${dto.email}
						</td>
					</tr>
					<tr>
						<th><span></span>주소</th>
						<td id="address">
							${dto.postcode} ${dto.address} ${dto.address2}
						</td>
					</tr>
					<tr>
						<th><span></span>휴대전화</th>
						<td id="call">
							${dto.phone}
						</td>
					</tr>
					<tr>
						<th><span></span>생년월일</th>
						<td>
							${dto.birth}
						</td>
					</tr>
					<tr>
						<th><span></span>성별</th>
						<td>
							<label><input type="radio" name="gender" value="여성">여성</label>
							<label><input type="radio" name="gender" value="남성">남성</label>
						</td>
						<script type="text/javascript">
						 //체크 해제할 라디오버튼 불러오기
					        var gender = document.getElementsByName("gender");
							var gen = "${dto.gender}";
					
					        for(var i=0; i<gender.length;i++){
								if(gender[i].value == gen){
									gender[i].checked = true;
								}else{
									gender[i].disabled = true;
								}             
					        }
						</script>
					</tr>
					<tr  id="news_letter">
						<th><span></span>뉴스레터 수신여부</th>
						<td>
							<p>이메일을 통한 상품 및 이벤트 정보 수신에 동의합니다.</p>
							<label><input type="radio" name="news" value="yes" checked>예</label>
							<label><input type="radio" name="news" value="no" disabled>아니오</label>
						</td>
					</tr>
					<tr id="sms_letter">
						<th ><span></span>SMS 수신여부</th>
						<td>
							<p>문자를 통한 상품 및 이벤트 정보 수신에 동의합니다.</p>
							<label><input type="radio" name="sms" value="yes"checked>예</label>
							<label><input type="radio" name="sms" value="no">아니오</label>
						</td>
					</tr>
				</table>
				
				<h3>분양회원 정보 입력<span>(다구좌 회원일 경우 가지고 계신 카드번호 중 하나를 입력해 주시면 됩니다)</span></h3>
				
				<table>
					<tr>
						<th>회원번호</th>
						<td>
							<input type="text">
							<span>하이픈(-)이나 띄어쓰기 없이 입력해 주시기 바랍니다.</span>
						</td>
					</tr>
					<tr>
						<th>회원인증번호</th>
						<td>
							<input type="text">
							<span>숫자 4자리 입력</span>
						</td>
					</tr>
				</table>
			</div>
		</section>
		</form>
		<!-- 푸터 -->
		<jsp:include page="footer.jsp"/>
	</body>
</html>