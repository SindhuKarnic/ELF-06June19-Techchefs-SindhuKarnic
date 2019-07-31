package com.techchefs.hibernate.util;
//Question 4. Write a Session Factory singleton class to get session object.

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernate.dto.CustomerBean;

public class HibernateUtil {
	private static SessionFactory sessionFactory = null;
	
	private HibernateUtil() {}
	
	private static SessionFactory getSessionfactory() {
		if(sessionFactory == null) {
			sessionFactory = new Configuration()
							.configure()
							.addAnnotatedClass(CustomerBean.class)
							.buildSessionFactory();
		}
		return sessionFactory;
	}
	public static Session openSession() {
		return getSessionfactory().openSession();
	}
}
