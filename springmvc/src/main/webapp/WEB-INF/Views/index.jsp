<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.util.ArrayList"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1> This is home page</h1>
<h1> Callled by home controlller</h1>

<% 
 String name=(String)request.getAttribute("name") ;
  ArrayList<Integer> numbers=(ArrayList<Integer>)request.getAttribute("num");
%>
<h1>Name is <%=name %></h1>
<%for(Integer i: numbers){
	out.println(i);
}
	%>
}
</body>
</html>