package com.techchefs.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private  static SessionFactory sf = null;
	
	private HibernateUtil() {}
	
	private static SessionFactory buildSessionFactory() {
		if(sf == null) {
			sf = new Configuration()
					.configure("com/techchefs/hibernateapp/cache/hibernate.cache.cfg.xml")
					.addAnnotatedClass(EmployeeNewInformation.class)
					.buildSessionFactory();
		}
		return sf;
	}
	public static Session openSession() {
		return buildSessionFactory().openSession();
	}
}
