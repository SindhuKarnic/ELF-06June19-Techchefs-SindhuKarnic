package com.techchefs.hibernateapp.util;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernateapp.onetoone.EmployeeInfoBean;
import com.techchefs.hibernateapp.onetoone.EmployeeOtherInfoBean;



public class RefinedHibernateUtil {
	private static SessionFactory sf;
	
	private RefinedHibernateUtil() {}
	
	private static SessionFactory buildSessionFactory() {
		return new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(EmployeeInfoBean.class)
					.addAnnotatedClass(EmployeeOtherInfoBean.class)
					.buildSessionFactory();
	}
	
	private static SessionFactory getSessionFactory() {
		if(sf == null) {
			sf = buildSessionFactory();
		}
		return sf;
	}
	public static Session getSession() {
		return getSessionFactory().openSession();
	}
}
