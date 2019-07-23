package com.techchefs.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techchefs.mywebapp.dao.EmployeeInfoBean;

public class MyFirstServlet extends HttpServlet{
 

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		ServletContext ctx = getServletContext();
		String movieName = ctx.getInitParameter("movie");
		
		ServletConfig config = getServletConfig();
		String actorName = config.getInitParameter("actor");
		
				String httpMethod = req.getMethod();
				String protocol = req.getProtocol();
				String requestUrl = req.getRequestURL().toString();
				System.out.println("httpMethod "+httpMethod);
				System.out.println("protocol "+protocol);
				System.out.println("requestUrl "+requestUrl);
		
				String currentDateTime = new Date().toString();
				
				//to get query string info
				String fnamevalue = req.getParameter("fname");
				String lnamevalue = req.getParameter("lname");
				
				String htmlResponse = "<!DOCTYPE html>"+
						"<html>"+
						"<head>"+
						"<meta charset=\"ISO-8859-1\">"+
						"<title>My First HTML</title> "+
						"</head> "+
						"<body>"+
						"	<h1>Current Date and time is :"+
						"	<br>"+
						"		<span style=\"color: red\">"+currentDateTime+"</span>  "+
						"	<br><br>"+
						"	First Name : "+fnamevalue+
						"	<br><br>"+
						"	Last Name : "+lnamevalue+
						"	<br><br>"+
						"	movie Name : "+movieName+
						"	<br><br>"+
						"	actor Name : "+actorName+
						"	</h1> "+
						"</body> "+
						"</html>";
				
				//Send to browser
				resp.setContentType("text/html");
				//resp.setHeader("Refresh", "1"); // Auto Refresh for Every Second
				PrintWriter out = resp.getWriter();
				out.print(htmlResponse);
				
				//get obj from forward servlet
				//EmployeeInfoBean empInfo = (EmployeeInfoBean) req.getAttribute("info");
				EmployeeInfoBean empInfo = (EmployeeInfoBean) ctx.getAttribute("info");
				if(empInfo == null) { 
					out.print("<html>"); out.print("<body>");
					out.print("<h1><span style=\"color: red\">Emp not found </span></h1>");
					out.print("</body>"); out.print("</html>"); 
				}else { 
					out.print("<html>");
					out.print("<body>");
					out.print("<h1><span style=\"color: red\">Emp found </span></h1>");
					out.print("<br>"); 
					out.print("<br>Id: "+empInfo.getId());
					out.print("<br>Name: "+empInfo.getName()); 
					out.print("<br>Movie: "+movieName); 
					out.print("<br>Actor: "+actorName); 
					//out.print("<br>Actoress: "+act); 
					out.print("</body>");
					out.print("</html>"); 
				} 
	}
}
