<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<c:set var="name" value="welcome to jstl">
</c:set>

<h1>Length is:<c:out value="${fn:length(name)}"></h1>
</c:out>

<h1>Uppercase:<c:out value="${fn:toUpperCase(name)}"></c:out>
</h1>


<h1>Lowercase:<c:out value="${fn:toLowerCase(name)}"></c:out>
</h1>>

</body>
</html>