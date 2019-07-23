package com.techchefs.warehouse.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hibernateUtil")
public class HibernateUtil {
	
	@Autowired
	private SessionFactory sf;
	
	public Session openSession() {
		return sf.openSession();
	}
}

