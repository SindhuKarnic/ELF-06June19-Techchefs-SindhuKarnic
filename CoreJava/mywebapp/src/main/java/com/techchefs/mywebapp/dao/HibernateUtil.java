package com.techchefs.mywebapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techchefs.mywebapp.dao.EmployeeInfoBean;

public class HibernateUtil {
	private static SessionFactory sf;
	
	private HibernateUtil() {}
	
	private static SessionFactory buildSessionFactory() {
		return new Configuration()
					.configure()
					.addAnnotatedClass(EmployeeInfoBean.class)
					.buildSessionFactory();
	}
	
	private static SessionFactory getSessionFactory() {
		if(sf == null) {
			sf = buildSessionFactory();
		}
		return sf;
	}
	public static Session openSession() {
		return getSessionFactory().openSession();
	}
}