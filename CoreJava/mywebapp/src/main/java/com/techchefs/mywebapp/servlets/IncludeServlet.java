package com.techchefs.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/include")
public class IncludeServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = "search?id=1";
		RequestDispatcher dispatcher = null;
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("11111111111111111");
		
		out.print("<br>");
		dispatcher = req.getRequestDispatcher("index.html");
		dispatcher.include(req, resp);
		out.print("<br>");
		
		out.println("22222222222222222");
		
		out.print("<br>");
		dispatcher = req.getRequestDispatcher("currentDate?fname=Sindhu&lname=k");
		dispatcher.include(req, resp);
		out.print("<br>");
		
		out.println("33333333333333333");
		
		out.print("<br>");
		dispatcher = req.getRequestDispatcher("/search?id=1");
		dispatcher.include(req, resp);
		out.print("<br>");
		
		/*
		 * out.println("444444444444444444444");
		 * 
		 * out.print("<br>"); dispatcher = req.getRequestDispatcher("/");
		 * dispatcher.include(req, resp); out.print("<br>");
		 */
		
		
		
	}
}
