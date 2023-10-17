<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Web01_JSP **</title>
</head>
<body>
<h2>** Hello Dynamic Web_Project **</h2>
<%--
** 아래 JSTL 과 비교 
<%
	if ( session.getAttribute("loginName") != null ) { %>
		<%=session.getAttribute("loginName")%> 님 안녕하세요 ~~<br>	
<% 	} else { %>
	로그인 후 이용하세요 <br>
<% } %> 
--%>
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
	&nbsp;<a href="/Web01/logout">LogOut</a>&nbsp;
	&nbsp;<a href="/Web01/detail">Myinfo</a><br>
</c:if>
<c:if test="${empty sessionScope.loginName}">
	&nbsp;<a href="/Web01/servletTestForm/flowEx04_LoginForm.jsp">LoginF</a>&nbsp;
	&nbsp;<a href="/Web01/jsp99_mvcTest/mvc2_sJoin.jsp">Join</a><br>
</c:if>
&nbsp;<a href="/Web01/helloS">HelloServlet</a>&nbsp;
&nbsp;<a href="/Web01/lifecycle">ServletLF</a><br>
&nbsp;<a href="/Web01/flow01">Flow01</a>&nbsp;
&nbsp;<a href="/Web01/servletTestForm/flow02_TestForm.jsp">Flow02_jsp</a><br>
&nbsp;<a href="/Web01/sessioni">SessionInfo</a>&nbsp;
&nbsp;<a href="/Web01/01set">ScopeTest</a><br>
&nbsp;<a href="/Web01/list2">List2</a>&nbsp;



</body>
</html>