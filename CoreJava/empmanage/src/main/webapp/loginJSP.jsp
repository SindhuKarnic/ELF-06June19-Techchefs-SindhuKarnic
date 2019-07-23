
<%@page import="com.techchefs.emp.EmployeeOtherInfoBean"%>
<%@page import="com.techchefs.emp.EmployeeInfoBean"%>
<html>
<head>
<meta charset='UTF-8'>
<meta name= "viewport" content= "width=device-width,
	initial-scale=1.0">
<meta http-equiv= "X-UA-Compatible" content= "ie=edge">
<title>Employee Management Portal</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<style>
.nav {
	background-color: beige;
}

.profile {
	height: 50px;
	width: 20px;
	background-color: blueviolet
}

.logout {
	font-size: 25px;
	color: brown;
	font-weight: 600;
}

.search-button {
	border: none;
	background-color: beige;
	margin-top: -26px;
	margin-left: -60px;
}

.employee-info {
	border: 1px solid brown;
}

.data-display {
	font-size: 18px;
	padding: 5px;
}
</style>
</head>
<body>

<%
EmployeeInfoBean bean = (EmployeeInfoBean) request.getAttribute("bean");
EmployeeOtherInfoBean obean = (EmployeeOtherInfoBean) bean.getOtherInfo();
%>

	<div style= "background-color:beige;">
		<h1 style="margin-left:35%">Employee Management Portal</h1>
		<div class= "row" style="height:70px; padding: 20px;"> 
<!-- 			<a class= "col-1 profile" href='./profile'> -->
<!-- 			<div > -->
<!-- 					<span></span> -->
<!-- 				</div></a> -->
			<div class="col-5">
				<span class="logout">Edit</span>
			</div>
			<div class= "search col-2">
				<form action="./search">
					<input type= "text" placeholder= "Search" name= "search"/>
				</form>
			</div>
			<div class="col-3">
				<a href="./logedout"><span class= "logout" style="margin-left: 70%;">Logout</span></a>
			</div>
		</div>
	</div>
	<br>
	<br>
	<div class= "employee-info container">
		<div class="data-display">ID: <%= bean.getId()%> </div>
		<div class="data-display">Name: <%=bean.getName()%></div>
		<div class="data-display">Account Number:
			<%=bean.getAccountNumber()%> </div>
		<div class="data-display">Email Id: <%=bean.getEmail()%></div>
		<div class="data-display">Age: <%=bean.getAge()%></div>
		<div class="data-display">Designation:
			<%=bean.getDesignation()%></div>
		<div class="data-display">Department Id:
			<%=bean.getDepartmentId()%></div>
		<div class="data-display">Manager Id: <%=bean.getManagerId()%></div>
		<div class="data-display">Phone: <%=bean.getPhone()%></div>
		<div class="data-display">Gender: <%=bean.getGender()%></div>
		<div class="data-display">Date of birth: <%=bean.getDob()%></div>
		<div class="data-display">Date of Joining:
			<%=bean.getJoiningDate()%></div>
		<div class="data-display">Salary: <%=bean.getSalary()%></div>
		<hr>
		<div class="data-display">PAN: <%=obean.getPan()%></div>
		<div class="data-display">Adhar no: <%=obean.getAdhar()%></div>
		<div class="data-display">Passport No: <%=obean.getPassport()%></div>
		<div class="data-display">Blood group: <%=obean.getBloodGroup()%></div>
		<div class="data-display">Mothers Name: <%=obean.getMotherNm()%></div>
		<div class="data-display">Fathers Name: <%=obean.getFatherNm()%></div>
		<div class="data-display">Religion: <%=obean.getReligion()%></div>
		<div class="data-display">Nationality: <%=obean.getNationality()%></div>
		<div class="data-display">Is Married: <%=obean.getIsmarried()%></div>
		<div class="data-display">Spouse Name: <%=obean.getSpouseNm()%></div>
		<div class="data-display">Is Challenged: <%=obean.getIschallenged()%></div>
		<div class="data-display">Emergency contact Name: <%=obean.getEmergencyContactName()%></div>
		<div class="data-display">Emergency contact number: <%=obean.getEmergencyContactNumber()%></div>
		
	</div>
	
</body>
</html>