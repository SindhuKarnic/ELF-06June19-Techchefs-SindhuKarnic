package com.techchefs.hibernateapp.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sf;
	
	private static SessionFactory buildSessionFactory() {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		return factory;
	}
	
	public static SessionFactory getSessionFactory() {
		if(sf == null) {
			sf = buildSessionFactory();
		}
		return sf;
	}
}
