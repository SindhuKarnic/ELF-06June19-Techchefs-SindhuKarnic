package com.techchefs.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernatapp.dto.EmployeeInfoBean;

public class DeleteData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		cfg.addAnnotatedClass(EmployeeInfoBean.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		EmployeeInfoBean empinf = session.get(EmployeeInfoBean.class, 2);
		
		Transaction trans = session.beginTransaction();
		session.delete(empinf);
		trans.commit();
		session.close();
	}

}
