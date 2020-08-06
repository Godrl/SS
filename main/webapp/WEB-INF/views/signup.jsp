<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up</title>
</head>
<body>
	<form action="/signup" method="post">
		<input type="text" name="name" placeholder="NAME"/>
		<input type="text" name="email" placeholder="EMAIL"/>
		<input type="password" name="password" placeholder="PASSWORD"/>
		<input type="password" name="CFMpassword" placeholder="CONFIRM PASSWORD"/>
		<button type="submit">Sign Up</button>
	</form>
</body>
</html>