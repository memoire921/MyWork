<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** JoList Spring_MVC2 **</title>
<link rel="stylesheet" type="text/css" href="/Spring02/resources/myLib/myStyle.css">
</head>
<body>
<h2>** JoList Spring_MVC2 **</h2>
<br>
<c:if test="${not empty message}">
	=> ${message}<br><hr>
</c:if>
<hr>
<table border="1" style="width:100%">
	<tr bgcolor="Gold" height="30">
		<th>Jno</th>
		<th>JoName</th>
		<th>ID</th>
		<th>조장이름</th>
		<th>Project</th>
		<th>Slogan</th>
	</tr>
	<c:if test="${not empty banana}">
		<c:forEach var="jo" items="${banana}">
		<tr height="30">
			<td><a href="jdetail?jno=${jo.jno}">${jo.jno}</a></td>
			<td>${jo.jname}</td>
			<td>${jo.id}</td>
			<td>${jo.cname}</td>
			<td>${jo.project}</td>
			<td>${jo.slogan}</td>
		</tr>
		</c:forEach>
	</c:if>
</table>
<hr>
<hr>
&nbsp;<a href="joInsert">조등록</a>&nbsp;
&nbsp;<a href="javascript:history.go(-1)">이전으로</a>&nbsp;
&nbsp;<a href="/Spring02/home">Home</a>&nbsp;
</body>
</html>