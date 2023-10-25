<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Spring_MVC2 Board Update **</title>
<link rel="stylesheet" type="text/css" href="/green/resources/myLib/myStyle.css">
</head>
<body>
<h2>** Spring_MVC2 Board Update **</h2>

<form action="bupdate" method="Post">
<table>
	<c:if test="${not empty requestScope.apple}">
		<tr height="40"><th bgcolor="Chocolate">Seq</th>
		<td><input type="text" name="seq" value="${requestScope.apple.seq}" size="20" readonly></td></tr>
		<tr height="40"><th bgcolor="Chocolate">I D</th>
			<td><input type="text" name="id" value="${requestScope.apple.id}" size="20" readonly></td></tr>
		<tr height="40"><th bgcolor="Chocolate">Title</th>
			<td><input type="text" name="title" value="${requestScope.apple.title}" size="50"></td></tr>
		<tr height="40"><th bgcolor="Chocolate">Content</th>
			<td><textarea rows="5" cols="50" name="content">${requestScope.apple.content}</textarea>
			</td></tr>
		<tr height="40"><th bgcolor="Chocolate">RegDate</th>
			<td><input type="text" name="regdate" value="${requestScope.apple.regdate}" size="20" readonly>
			</td></tr>
		<tr height="40"><th bgcolor="Chocolate">조회수</th>
			<td><input type="text" name="cnt" value="${requestScope.apple.cnt}" size="20" readonly>
			</td></tr>
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