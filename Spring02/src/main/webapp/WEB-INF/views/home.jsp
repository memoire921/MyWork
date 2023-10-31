<%@ page language="java" contentType="text/html; charset=UTF-8" 
    	 pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<meta charset = "UTF-8">
	<title>Home</title>
	<link rel="stylesheet" type="text/css" href="/Spring02/resources/mylib/myStyle.css">
</head>
<body>
<h1>
	Hello Spring MVC !!!  
</h1>
<P>* Server_Time: ${serverTime}</P>
<hr>
<c:if test="${not empty sessionScope.loginID}">
	=> ${sessionScope.loginName}님 안녕하세요 ~~<br>
</c:if>
<c:if test="${not empty requestScope.message}">
	=> ${requestScope.message}<br>
</c:if>
<hr>
<img alt="mainImage" src="/Spring02/resources/images/daft.png" width="700" height="400" >
<hr>
<!-- Login 전 -->
<c:if test="${empty sessionScope.loginID}">
	&nbsp;<a href="member/loginForm">LoginF</a>&nbsp;
	&nbsp;<a href="member/memberJoin">JoinF</a>&nbsp;
</c:if>
<!-- Login 후 -->
<c:if test="${not empty sessionScope.loginID}">
	&nbsp;<a href="member/logout">Logout</a>&nbsp;
	&nbsp;<a href="member/mdetail?id=${sessionScope.loginID}">내정보</a>&nbsp;
	&nbsp;<a href="member/mdetail?jCode=U&id=${sessionScope.loginID}">내정보수정</a>&nbsp;
	&nbsp;<a href="member/pUpdateForm">PW수정</a>&nbsp;
	&nbsp;<a href="member/mdelete?id=${sessionScope.loginID}">탈퇴</a>&nbsp;
</c:if>
<br>
&nbsp;<a href="member/memberList">mList</a>&nbsp;
&nbsp;<a href="member/log4jtest">롬복log4j</a>&nbsp;
&nbsp;<a href="board/boardList">bList</a>&nbsp;
&nbsp;<a href="jo/joList">jList</a><br>
&nbsp;<a href="bcrypt">BCrypt</a>&nbsp;

</body>
</html>
