package com.techchefs.hibernateapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernatapp.dto.EmployeeInfoBean;

public class SaveData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeInfoBean.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		EmployeeInfoBean empinf = new EmployeeInfoBean();
		/*
		 * SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd"); Date date = null;
		 * try { date = form.parse("1993-04-03"); } catch (ParseException e) {
		 * e.printStackTrace(); }
		 */
		
		empinf.setId(20);
		empinf.setName("harry");
		empinf.setDeptId(103);
		empinf.setDesignation("dev");
		empinf.setDob(new Date(1992-05-05));
		empinf.setEmail("harryyyy@mail.com");
		empinf.setGender("male");
		empinf.setJoiningDate(new Date(2018-05-05));
		empinf.setMngrId(4);
		empinf.setPhone(22222222);
		empinf.setSalary(25000);
		empinf.setAccountNumber(11111111);
		empinf.setAge(25);
		
		Transaction trans = session.beginTransaction();
		//session.save(empinf);
		session.saveOrUpdate(empinf);
		trans.commit();
		session.close();
		
	}

}
