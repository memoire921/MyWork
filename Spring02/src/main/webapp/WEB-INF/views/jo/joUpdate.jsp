<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Spring_MVC2 jo Update **</title>
<link rel="stylesheet" type="text/css" href="/green/resources/myLib/myStyle.css">
</head>
<body>
<h2>** Spring_MVC2 jo Update **</h2>

<form action="jupdate" method="Post">
<table>
	<c:if test="${not empty requestScope.apple}">
		<tr height="40"><th bgcolor="Chocolate">Jno</th>
		<td><input type="text" name="jno" value="${requestScope.apple.jno}" size="20" readonly></td></tr>
		<tr height="40"><th bgcolor="Chocolate">Jname</th>
		<td><input type="text" name="jname" value="${requestScope.apple.jname}" size="20" readonly></td></tr>
		<tr height="40"><th bgcolor="Chocolate">I D</th>
			<td><input type="text" name="id" value="${requestScope.apple.id}" size="20" readonly></td></tr>
		<tr height="40"><th bgcolor="Chocolate">Project</th>
			<td><input type="text" name="project" value="${requestScope.apple.project}" size="50"></td></tr>
		<tr height="40"><th bgcolor="Chocolate">Slogan</th>
			<td><input type="text" name="slogan" value="${requestScope.apple.slogan}" size="50"></td></tr>
		<tr height="40"><th></th>
			<td><input type="submit" value="수정">&nbsp;&nbsp;&nbsp;
				<input type="reset" value="취소">
			</td>
		</tr>
	</c:if>
	<c:if test="${empty requestScope.apple}">
		<tr height="40"><td>~~ 수정할 자료가 존재하지 않습니다 ~~</td>
		</tr>
	</c:if>
</table>
</form>
<hr>
<c:if test="${not empty requestScope.message}">
=> ${requestScope.message}
</c:if>
<hr>
&nbsp;<a href="javascript:histoty.go(-1)">이전으로</a>&nbsp;
&nbsp;<a href="/green/home">Home</a>&nbsp;

</body>
</html>