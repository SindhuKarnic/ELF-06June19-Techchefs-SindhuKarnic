package com.techchefs.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/createCookie")
public class CreateCookieServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie myNameCookie = new Cookie("myName", "sindhu");
		Cookie myLocCookie = new Cookie("myLocation", "Blore");
		myLocCookie.setMaxAge(7*24*60*60);
		
		resp.addCookie(myNameCookie);
		resp.addCookie(myLocCookie);
		
		PrintWriter out = resp.getWriter();
		out.print("created cookie");
		
		
	}
}
