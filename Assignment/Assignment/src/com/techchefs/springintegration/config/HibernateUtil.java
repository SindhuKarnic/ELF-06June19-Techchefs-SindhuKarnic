package com.techchefs.springintegration.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class HibernateUtil {
	public static Session openSession() {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringUtil.class);
		SessionFactory factory = context.getBean(SessionFactory.class); 
		Session session = factory.openSession();
		return session;
	}

}

