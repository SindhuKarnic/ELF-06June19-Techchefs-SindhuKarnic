package com.techchefs.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernateapp.criteria.CallStroredProc;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("com/techchefs/hibernateapp/cache/hibernate.cache.cfg.xml");
		config.addAnnotatedClass(EmployeeNewInformation.class);
		
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		EmployeeNewInformation bean = session.get(EmployeeNewInformation.class, 1);
		log.info("" +bean.toString());
		
		EmployeeNewInformation bean1 = session.get(EmployeeNewInformation.class, 1);
		log.info("" +bean1.toString());
		
		EmployeeNewInformation bean2 = session.get(EmployeeNewInformation.class, 1);
		log.info("" +bean2.toString());
		
	
		
		session.close();
	}

}
