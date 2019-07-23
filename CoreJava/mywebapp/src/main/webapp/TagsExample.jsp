<%!
	public String name="abc";
	private int age = 100;
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>jsp tag example</h1>
<%!
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getName(String name) {
		return "Given name is " +name;
	}
%>
<p> Name <%= name %></p>
<p> Name2 <%= getName() %></p>
<p> Name3 <%= getName("aaaa") %></p>
<p> Age <%= getAge() %></p>
<%
	for(int i=0;i<5;i++) {
%>
<%= name %>
<%
	}
%>

</body>
</html>