<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">

		<!-- to import a package in jsp -->
		<!-- this tag is called directive -->
		<%@page import="java.util.Date" %>


		<!-- this tag is called declaration -->
		<%!
			int value = 9;
			// If you declare a methode here it will be going in the class "service(req, res)"
			// So what you want to have inside the class and outside the service method will be declared here
		%>

		<!-- this tag is called scriptlet -->
		<%
			int i = Integer.parseInt(request.getParameter("num1"));
			int j = Integer.parseInt(request.getParameter("num2"));
			
			int k = i + j;
			
			out.println("Output : " + k);
		%>
		
		<!-- to print something -->
		<!-- this tag is called expression -->
		<%= k %>

</body>
</html>