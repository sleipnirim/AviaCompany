<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add User</title>
</head>
<body>
<jsp:include page="/localization.jsp" />
<jsp:include page="/header.jsp" />
<table>
	<tr><td>
	<form action="Controller">
		<input type="hidden" name="command" value="addUser">
		${askLogin}</td>
		<td>
		<input type="text" name = "login"></td></tr>
		<tr><td>${askPassword}</td>
		<td><input type="password" name = "password" /></td></tr>
		<tr><td>${askName}</td>
		<td><input type="text" name = "name" /></td></tr>
		<tr><td>${askSurname}</td>
		<td><input type="text" name = "surname"></td></tr>
		<tr><td>${askPosition}</td>
		<td><select name="position">
			<option disabled="disabled" value="${selectPosition}">
			<option value="Administrator">Administrator</option>
			<option value="Dispatcher">Dispatcher</option>
			<option value="Pilot">Pilot</option>
			<option value="Navigator">Navigator</option>
			<option value="Radioman">Radioman</option>
			<option value="Stewardess">Stewardess</option>
		</select></td></tr>
		<tr><td><input type="submit" value="${submitLoginButton}">
	</form></td></tr>
</table>
<c:choose>
	<c:when test="${requestScope.addStatus eq 1}">
		<c:out value="${DBError}" />
	</c:when>
	<c:when test="${requestScope.addStatus eq 2}">
		<c:out value="${complData}" />
	</c:when>
	<c:when test="${requestScope.addStatus eq 3}">
		<c:out value="${addSuccess}" />
	</c:when>
</c:choose>
<c:set var="pageURL" value="WEB-INF/addUser.jsp" />
<jsp:include page="/footer.jsp" />
</body>
</html>