package com.techchefs.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernatapp.dto.EmployeeInfoBean;
import com.techchefs.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class PrintData {

	public static void main(String[] args) {
		//Without Util
		
		  Configuration cfg = new Configuration(); cfg.configure("hibernate.cfg.xml");
		  
		  cfg.addAnnotatedClass(EmployeeInfoBean.class);
		  
		  SessionFactory factory = cfg.buildSessionFactory(); Session session =
		  factory.openSession();
		  
		  EmployeeInfoBean empinf = session.get(EmployeeInfoBean.class, 2);
		  
		  log.info("name " +empinf.getName());
		  
		  session.close();
		 

		//With Util

//		SessionFactory factory = HibernateUtil.getSessionFactory();
//		Session session = factory.openSession(); 
//		EmployeeInfoBean empinf = session.get(EmployeeInfoBean.class, 1);
//		log.info("name " +empinf.getName());
//		session.close();

	}

}
