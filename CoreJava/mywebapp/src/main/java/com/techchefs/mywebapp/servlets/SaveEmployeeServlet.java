package com.techchefs.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techchefs.mywebapp.dao.EmployeeDAO;
import com.techchefs.mywebapp.dao.EmployeeDAOFactory;
import com.techchefs.mywebapp.dao.EmployeeInfoBean;

import lombok.extern.java.Log;

@WebServlet("/save")
@Log
public class SaveEmployeeServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean = new EmployeeInfoBean();
		
		bean.setId(Integer.parseInt(req.getParameter("id")));
		bean.setName(req.getParameter("name"));
		bean.setAccountNumber(Long.parseLong(req.getParameter("accNo")));
		bean.setEmail(req.getParameter("emailId"));
		bean.setAge(Integer.parseInt(req.getParameter("age")));
		bean.setDesignation(req.getParameter("designation"));
		bean.setGender(req.getParameter("gender"));
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			bean.setDob(formatter.parse(req.getParameter("dob")));
			bean.setJoiningDate(formatter.parse(req.getParameter("doj")));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		bean.setSalary(Double.parseDouble(req.getParameter("salary")));
		bean.setDepartmentId(Integer.parseInt(req.getParameter("deptId")));
		bean.setPhone(Long.parseLong(req.getParameter("phNo")));
		bean.setManagerId(Integer.parseInt(req.getParameter("mgrId")));
		boolean isInserted = dao.createEmployeeInfo(bean);
		log.info("DATE " +req.getParameter("dob"));
		log.info("BEAN " +bean);
		PrintWriter out = resp.getWriter();
		if(isInserted) {
			out.print("<html>");
			out.print("<body>");
			out.print("<h1><span style=\"color: green\">Emp data inserted </span></h1>");
			out.print("</body>");
			out.print("</html>");
		} else {
			out.print("<html>");
			out.print("<body>");
			out.print("<h1><span style=\"color: red\">Emp data not inserted </span></h1>");
			out.print("</body>");
			out.print("</html>");
		}
	}
}
