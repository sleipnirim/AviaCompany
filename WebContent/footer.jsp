<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<c:out value="${localeSetMessage}" />
		<p>
		<table><tr><td>
		<form action="Controller" method="post">
			<input type="hidden" name="pageURL" value="${pageURL}">
			<input type="hidden" name="command" value="setLocale">
			<input type="hidden" name="local" value="en">
			<input type="submit" value="${enButton}">
		</form></td>
		
		<td><form action="Controller" method="post">
			<input type="hidden" name="pageURL" value="${pageURL}">
			<input type="hidden" name="command" value="setLocale">
			<input type="hidden" name="local" value="ru">
			<input type="submit" value="${ruButton}">
		</form></td></tr></table>

</body>
</html>