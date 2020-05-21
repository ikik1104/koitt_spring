<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원가입</h2>
	<form action="joinOk" method="post">
	회원 번호 : <input type="text" name="num">
	회원 이름 : <input type="text" name="name">
	주소 : <input type="text" name="address">
	전화번호: <input type="text" name="tel">
	생년월일 : <input type="date" name="birth">
	<input type="submit" value="전송">
	</form>
</body>
</html>