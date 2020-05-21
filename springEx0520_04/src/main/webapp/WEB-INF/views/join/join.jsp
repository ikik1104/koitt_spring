<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보</title>
</head>
<body>
<h2>학생 성적 입력</h2>
<form action="joinOk" method="get">
	<label>학생 번호 : <input type="text" name="num"></label><br>
	<label>학생 이름 : <input type="text" name="name"></label><br>
	<label>국어 : <input type="text" name="kor"></label><br>
	<label>영어 : <input type="text" name="eng"></label><br>
	<label>수학 : <input type="text" name="math"></label><br>
<!-- 	<label>합계 : <input type="text" name="total"></label><br> -->
<!-- 	<label>평균 : <input type="text" name="avg"></label> -->
	<input type="submit" value="입력">
</form>
</body>
</html>