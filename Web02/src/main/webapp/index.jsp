<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Web02_JSP **</title>
</head>
<body>
<h2>** Hello Dynamic Web_Project **</h2>
<c:if test="${not empty sessionScope.loginName}">
	${sessionScope.loginName} 님 안녕하세요 ~~<br>
</c:if>
<c:if test="${empty sessionScope.loginName}">
	로그인 후 이용하세요 <br>
</c:if>
<hr>
<img alt="" src="./images/a2.png" width="400" height="300">
<hr>
<c:if test="${not empty sessionScope.loginName}">
	&nbsp;<a href="/Web02/logout">LogOut</a>&nbsp;
	&nbsp;<a href="/Web02/detail">Myinfo</a><br>
</c:if>
<c:if test="${empty sessionScope.loginName}">
	&nbsp;<a href="/Web02/member/loginForm.jsp">LoginF</a>&nbsp;
	&nbsp;<a href="/Web02/member/memverJoin.jsp">Join</a><br>
</c:if>

&nbsp;<a href="/Web02/mlist">List</a>&nbsp;



</body>
</html>