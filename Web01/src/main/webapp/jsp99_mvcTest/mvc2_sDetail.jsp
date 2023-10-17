<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Web_MVC2 Student Detail **</title>
</head>
<body>
<h2>** Web_MVC2 Student Detail **</h2>
<table>
<c:if test="${not empty requestScope.apple}">
	<tr height="40"><th bgcolor="pink">Sno</th>
		<td>${requestScope.apple.sno}</td></tr>
	<tr height="40"><th bgcolor="pink">Name</th>
		<td>${requestScope.apple.name}</td></tr>
	<tr height="40"><th bgcolor="pink">Age</th>
		<td>${requestScope.apple.age}</td></tr>
	<tr height="40"><th bgcolor="pink">Jno</th>
		<td>${requestScope.apple.jno}</td></tr>
	<tr height="40"><th bgcolor="pink">Info</th>
		<td>${requestScope.apple.info}</td></tr>
	<tr height="40"><th bgcolor="pink">Point</th>
		<td>${requestScope.apple.point}</td></tr>
	<tr height="40"><th bgcolor="pink">Birthday</th>
		<td>${requestScope.apple.birthday}</td></tr>
</c:if>
<c:if test="${empty requestScope.apple}">
	<tr><td colspan="2">~~ 출력할 자료가 없습니다 ~~</td></tr>
</c:if>
</table>
</body>
</html>