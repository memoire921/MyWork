<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Spring_MVC2 Password Update **</title>
<link rel="stylesheet" type="text/css" href="/Spring02/resources/myLib/myStyle.css">
<script src="/Spring02/resources/myLib/jquery-3.2.1.min.js"></script>
</head>
<body>
<h2>** Spring_MVC2 Password Update **</h2>

<form action="pUpdateForm" method="Post" enctype="multipart/form-data">
<table>
		<!-- id: 화면출력, 서버로 전송, 수정은불가(즉, input Tag 의 입력 막기) 
				 -> readonly: 서버로 전송 (권장)
				 -> disabled: 서버로 전송되지않음
		-->
		
		<!-- password 수정: 기본적으로 복호화불가능한 방식으로 암호화되어있기 때문에 별도로 처리
						-> 암호수정: 별도의 수정화면에서 재입력후 교체됨
					  	-> 암호찾기: 본인 재인증 후, 새암호를 발송 -> 새암호로 본인이 로그인후 수정  
		-->
		
	<tr height="40"><th bgcolor="Khaki">Password</th>
		<td><input type="password" name="password" value=${requestScope.apple.password} size="20"></td></tr>	
		
	<tr height="40"><th bgcolor="Khaki">재 확 인</th>
		<td><input type="password" name="password" value=${requestScope.apple.password} size="20"></td></tr>

	<tr height="40"><th></th>
		<td><input type="submit" value="수정">&nbsp;&nbsp;&nbsp;
			<input type="reset" value="취소">		
		</td>
	</tr>
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
&nbsp;<a href="javascript:history.go(-1)">이전으로</a>&nbsp;
&nbsp;<a href="/Spring02/home">Home</a>&nbsp;
</body>
</html>