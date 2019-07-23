package com.techchefs.mywebapp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techchefs.mywebapp.dao.DepartmentInfoBean;
import com.techchefs.mywebapp.dao.EmployeeDAO;
import com.techchefs.mywebapp.dao.EmployeeDAOFactory;
import com.techchefs.mywebapp.dao.EmployeeInfoBean;

@WebServlet("/saveDepartment")
public class CreateDepartmentServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(DepartmentInfoBean.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		DepartmentInfoBean bean = new DepartmentInfoBean();
		bean.setDeptId(Integer.parseInt(req.getParameter("id")));
		bean.setDeptName(req.getParameter("name"));
		
		Transaction trans = session.beginTransaction();
		session.saveOrUpdate(bean);
		trans.commit();
		session.close();
	}

}
