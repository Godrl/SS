<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up</title>
</head>
<body>
	<form action="/signup" method="post">
		<input type="text" name="Name" placeholder="NAME"/>
		<input type="text" name="Email" placeholder="EMAIL"/>
		<input type="password" name="Password" placeholder="PASSWORD"/>
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		<button type="submit">Sign Up</button>
	</form>
</body>
</html>