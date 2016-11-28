<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<c:if test="${not (sessionScope.user eq null)}">
		<c:out value="${user.name}"></c:out>
		<form action="Controller">
			<input type="hidden" name="command" value="toPersonalPage">
			<input type="submit" value="${toPersonalPage}">
		</form>
		<form action="Controller">
			<input type="hidden" name="command" value="logout">
			<input type="submit" value="${logout}">
		</form>
	</c:if>
	<c:if test="${sessionScope.user eq null}">
		<c:out value="${guest}"></c:out>
		<form action="login.jsp">
			<input type = submit value="${loginButton}" >
		</form>
	</c:if>
	
</body>
</html>