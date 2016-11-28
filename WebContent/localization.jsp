<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<body>
<fmt:setLocale value="${sessionScope.local}" />
<fmt:setBundle basename="localization.local" var="loc" scope="session" />
<fmt:message bundle="${loc}" key="local.welcome" var="welcome" scope="session"/>
<fmt:message bundle="${loc}" key="local.loginButton" var = "loginButton" scope="session"/>
<fmt:message bundle="${loc}" key="local.enButton" var="enButton" scope="session"/>
<fmt:message bundle="${loc}" key="local.ruButton" var="ruButton" scope="session"/>
<fmt:message bundle="${loc}" key="local.localeSetMessage" var="localeSetMessage" scope="session"/>
<fmt:message bundle="${loc}" key="local.askLogin" var="askLogin" scope="session"/>
<fmt:message bundle="${loc}" key="local.askPassword" var="askPassword" scope="session"/>
<fmt:message bundle="${loc}" key="local.submitLoginButton" var="submitLoginButton" scope="session"/>
<fmt:message bundle="${loc}" key="local.hello" var="hello" scope="session"/>
<fmt:message bundle="${loc}" key="local.positionLogin" var="positionLogin" scope="session"/>
<fmt:message bundle="${loc}" key="local.guest" var="guest" scope="session"/>
<fmt:message bundle="${loc}" key="local.logout" var="logout" scope="session"/>
<fmt:message bundle="${loc}" key="local.toPersonalPage" var="toPersonalPage" scope="session"/>
<fmt:message bundle="${loc}" key="local.toMain" var="toMain" scope="session"/>
<fmt:message bundle="${loc}" key="local.addUser" var="addUser" scope="session"/>
<fmt:message bundle="${loc}" key="local.askName" var="askName" scope="session"/>
<fmt:message bundle="${loc}" key="local.askSurname" var="askSurname" scope="session"/>
<fmt:message bundle="${loc}" key="local.askPosition" var="askPosition" scope="session"/>
<fmt:message bundle="${loc}" key="local.selectPosition" var="selectPosition" scope="session"/>
</body>
</html> 