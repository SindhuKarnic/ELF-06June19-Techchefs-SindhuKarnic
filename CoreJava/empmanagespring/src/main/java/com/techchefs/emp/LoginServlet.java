package com.techchefs.emp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginpage")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie dummyC = new Cookie("dummyCookie" ,"CheckCookiesEnabled");
		resp.addCookie(dummyC);
		
		HttpSession session = req.getSession(false);
		if(session == null) {
			RequestDispatcher disp = req.getRequestDispatcher("./index.html");
			disp.include(req, resp);
		} else {
			RequestDispatcher disp = req.getRequestDispatcher("./login");
			disp.forward(req, resp);
		}
	}
}
