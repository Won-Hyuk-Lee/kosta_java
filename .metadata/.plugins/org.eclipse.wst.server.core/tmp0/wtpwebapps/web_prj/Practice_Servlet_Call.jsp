<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="http://localhost:8081/board_servlet_url">서블릿 GET방식 호출</a>
<a href="/board_servlet_url">서블릿 GET방식 호출</a><br><br>

<form method="get" action="/board_servlet_url">
	<input name = "userid" type = "text"><br>
	<input type = "submit" value = "서블릿 get방식 호출">
</form><br><br>

<form method="post" action="/board_servlet_url">
	<input name = "userid" type = "text"><br>
	<input name = "userpwd" type = "password"><br>
	<input name = "gender" type = "radio" value = 'm'>남
	<input name = "gender" type = "radio" value = 'f'>여<br>
	<input name = "habit" type = "checkbox" value = "111">111
	<input name = "habit" type = "checkbox" value = "222">222
	<input name = "habit" type = "checkbox" value = "333">333<br>
	
	<select name = "subject">
		<option value = "korean">국어</option>
		<option value = "english">영어</option>
		<option value = "math">수학</option>
	</select><br>
	
	<input type = "file" name = "userfile"><br>
	
	<input type = "hidden" name = "secret" value = "12345"><br>
	
	<textarea name = "contents" rows="10" cols="50"></textarea><br>
	<input type = "submit" value = "서블릿 post방식 호출"><br>
	
</form><br><br>
</body>
</html>