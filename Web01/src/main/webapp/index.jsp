<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Web01_JSP **</title>
</head>
<body>
<h2>** Hello Dynamic Web_Project **</h2>
<%
	if ( session.getAttribute("loginName") != null ) { %>
		<%=session.getAttribute("loginName")%> 님 안녕하세요 ~~<br>	
<% 	} else { %>
	로그인 후 이용하세요 <br>
<% } %>

<hr>
<img alt="" src="./images/a2.png" width="400" height="300">
<hr>
&nbsp;<a href="/Web01/servletTestForm/flowEx04_LoginForm.jsp">LoginF</a>&nbsp;
&nbsp;<a href="/Web01/helloS">HelloServlet</a>&nbsp;
&nbsp;<a href="/Web01/lifecycle">ServletLF</a><br>
&nbsp;<a href="/Web01/flow01">Flow01</a>&nbsp;
&nbsp;<a href="/Web01/servletTestForm/flow02_TestForm.jsp">Flow02_jsp</a><br>
&nbsp;<a href="/Web01/sessioni">SessionInfo</a>&nbsp;
&nbsp;<a href="/Web01/01set">ScopeTest</a><br>
&nbsp;<a href="/Web01/logout">LogOut</a>&nbsp;


</body>
</html>