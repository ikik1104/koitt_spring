<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>결과</h2>
<p>번호 : ${board.num}</p>
<p>제목 : ${board.title}</p>
<p>내용 : ${board.content}</p>
<p>날짜 : ${board.date}</p>
<p>그룹 : ${board.group}</p>
<p>step : ${board.step}</p>
<p>indent : ${board.indent}</p>

<h2><a href="main">main으로</a></h2>
</body>
</html>