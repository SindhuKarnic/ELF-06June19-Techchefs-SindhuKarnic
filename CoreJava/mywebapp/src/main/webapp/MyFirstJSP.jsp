<%@page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My First HTML</title>
</head>
<body>
	<h1>Current Date and time is : 
	<% 
		String currentDateTime = new Date().toString();
	%>
	<br>
		<span style="color: red"><%= currentDateTime %></span>
	</h1>
	</body>
</html>