<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<%@ include file="/WEB-INF/views/include/header.jsp"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
</head>
<body>
	Admin Page
</body>

<a href='<c:url value="/"/>'>GUEST</a>
<a href='<c:url value="/user/main"/>'>USER</a>
<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</html>