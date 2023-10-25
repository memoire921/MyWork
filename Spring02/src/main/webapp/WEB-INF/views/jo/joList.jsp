<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Spring_MVC2 joList **</title>
<link rel="stylesheet" type="text/css" href="/green/resources/myLib/myStyle.css">
</head>
<body>
<h2>** Spring_MVC2 joList **</h2>

<hr>
<c:if test="${not empty requestScope.message}">
	=> ${requestScope.message}<br><hr>
</c:if>
<table border="1" style="width:90%">
	<tr bgcolor="DeepPink">
		<th>Jno</th>
		<th>Jname</th>
		<th>ID</th>
		<th>Project</th>
		<th>Slogan</th>
		<!-- 관리자 기능 추가 -->
		<c:if test="${sessionScope.loginID == 'admin'}">
			<th>조 삭제</th>
		</c:if>
	</tr>
	<c:if test="${not empty requestScope.banana}">
		<c:forEach var="s" items="${requestScope.banana}">
		<tr><td>${s.jno}</td>
		<!-- Title 
			=> 로그인 한 경우에만 글내용을 볼 수 있도록 Link 추가 -->
		<td><c:if test="${not empty sessionScope.loginID}">
				<a href="jodetail?seq=${s.jno}">${s.jname}</a>
			</c:if>
			<c:if test="${empty sessionScope.loginID}">
				${s.jname}
			</c:if>
		</td>
			<td>${s.id}</td>
			<td>${s.project}</td>
			<td>${s.slogan}</td>
			<!-- 관리자 기능 추가 -->
			<c:if test="${sessionScope.loginID == 'admin'}">
				<td align="center"><a href="jdelete?id=${s.id}">조 삭제</a></td>
			</c:if>
		</tr>
		</c:forEach>
	</c:if>
	<c:if test="${empty requestScope.banana}">
		<tr><td colspan="5">출력할 Data가 1건도 없습니다 ~~</td>
		</tr>
	</c:if>
</table>
<hr>

<c:if test="${not empty sessionScope.loginID}">
		&nbsp;<a href="joInsert">새조 등록</a>&nbsp;
</c:if>
&nbsp;<a href="/green/home">Home</a>&nbsp;
</body>
</html>