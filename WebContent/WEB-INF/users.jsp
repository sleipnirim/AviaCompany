<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Users</title>
</head>
<body>
	<jsp:include page="/localization.jsp" />
	<jsp:include page="/header.jsp" />
	<jsp:useBean id="user" class="by.htp6.bean.User" />
	<c:out value="${requestScope.errorMessage}"></c:out>
	<table>
		<c:forEach items="${requestScope.users}" var="user">
			<tr>
				<td><p align="right">  ${user.login}  |</p></td>
				<td><p align="right">  ${user.name}  |</p></td>
				<td><p align="right">  ${user.surname}  |</p></td>
				<td><p align="right">  ${user.position}  |</p></td>
				<td><form action="Controller">
						<input type="hidden" name="command" value="editUser">
						<input type="hidden" name="userID" value="${user.id}">
						<input type="submit" value="${edit}">
					</form></td>
				<td><form action="Controller">
						<input type="hidden" name="command" value="deleteUser">
						<input type="hidden" name="userID" value="${user.id}">
						<input type="submit" value="${delete}">
					</form></td>
			</tr>
		</c:forEach>
	</table>
	<c:set var="pageURL" value="WEB-INF/users.jsp" scope="session"/>
	<jsp:include page="/footer.jsp" />
</body>
</html>