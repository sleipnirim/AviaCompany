<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AviaCompany</title>
</head>


	<body>
		<jsp:include page="localization.jsp" />
		<jsp:include page="header.jsp" />
		<h2><c:out value="${welcome}" /></h2>
		<p>
		<c:set var = "pageURL" value="index.jsp" scope = "session" />
		<jsp:include page="footer.jsp" />
		
	</body>
</html>