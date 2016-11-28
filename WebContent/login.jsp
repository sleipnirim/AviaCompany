<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<jsp:include page="localization.jsp"></jsp:include>
<body>
	<table><tr><td><form action="Controller">
	
		<input type="hidden" name="command" value="login">
		<p>${askLogin}</p></td>
		<td><input type="text" name="login"></td></tr>
		<tr><td><p>${askPassword}</p></td>
		<td><input type="password" name="password"></td></tr>
		<tr><td><input type="submit" value="${submitLoginButton}"> 
	</form></td></tr></table>
	<jsp:useBean id="user" class="by.htp6.bean.User" />
	<c:if test="${requestScope.user.errorStatus}">
		<c:out value="${requestScope.user.errorMessage}"></c:out>
	</c:if>
	<c:set var = "pageURL" value="login.jsp" scope = "session" />
		<jsp:include page="footer.jsp" />
</body>
</html>