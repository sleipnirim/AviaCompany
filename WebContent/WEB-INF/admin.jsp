<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin page</title>
</head>
<jsp:include page="/localization.jsp" />
	<body>
	<jsp:include page="/header.jsp" />
		<c:set var="pageURL" value="WEB-INF/admin.jsp" />
		<jsp:useBean id="user" class="by.htp6.bean.User" />
		<h3>${hello} ${sessionScope.user.name}, ${positionLogin} ${sessionScope.user.position}</h3>
		<form action="index.jsp">
			<input type="submit" value="${toMain}"> 
		</form>
		<form action="Controller">
			<input type="hidden" name="command" value="redir">
			<input type="hidden" name="redirURL" value="WEB-INF/addUser.jsp">
			<input type="submit" value="${addUser}">
		</form>
		<c:set var = "pageURL" value="WEB-INF/admin.jsp" scope = "session" />
		<jsp:include page="/footer.jsp" />
	</body>
</html>