<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<body>
	111111111111111111111111111111111
	<br>
	<jsp:include page="index.html"></jsp:include>
	<br>
	222222222222222222222222222222222222
	<br>
	<jsp:include page="currentDate"></jsp:include>
	<br>
	3333333333333333333333333333333333333
	<br>
	<jsp:include page="currentDate?fname=123&lname=456"></jsp:include>
	<br>
	444444444444444444444444444444
	<br>
	<jsp:include page="currentDate">
	<jsp:param name="fname" value="123"/>
	<jsp:param name="lname" value="456"/>
	</jsp:include>
	<br>
	5555555555555555555555555555
	<br>
	<jsp:include page="MyFirstJSP.jsp"/>
</body>
</html>