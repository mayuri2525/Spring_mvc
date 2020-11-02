<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="i" value="10" scope="application"></c:set>>

<h1>Value is: <c:out value="${i}"></c:out></h1>

<c:remove var="i"></c:remove>

<h1>Value is: <c:out value="${i}"></c:out></h1>

<c:set var="k"  value="20" scope="application"></c:set>
<h1>Value is: <c:out value="${k}"></c:out></h1>

<c:if test="${k==30}">
<h1> welcome</h1>
</c:if>

<c:redirect url="https://meet.google.com/"></c:redirect>



</body>
</html>