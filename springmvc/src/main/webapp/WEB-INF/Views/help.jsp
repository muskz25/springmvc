<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.time.LocalDateTime"%>
 <%@page isELIgnored="false" %>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is Help Page</title>
</head>
<body>
<h1> help page</h1>
<%
/* String name=(String)request.getAttribute("name");
Integer roll=(Integer)request.getAttribute("rollnumber");
LocalDateTime time=(LocalDateTime)request.getAttribute("time"); */
%>

<h1>Hello my name is ${name}<%-- <%=name%> --%></h1>
<h1>this is roll number ${rollnumber}<%-- <%=rollnumber%> --%></h1>
<h1>Time is ${time}<%-- <%=time%> --%></h1>
<hr>
<h1>Marks is ${marks}</h1>

<hr>

<c:forEach var="item" items="${marks}">
<h1>${item}</h1>
</c:forEach>


</body>
</html>