package com.techchefs.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernateapp.criteria.CallStroredProc;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest2 {
	
	public static void main(String[] args) {
		log.info("1" +getEmployeedata(1).toString());
		log.info("2" +getEmployeedata(1).toString());
		log.info("3" +getEmployeedata(1).toString());
	}
	private static EmployeeNewInformation getEmployeedata(int id) {
		EmployeeNewInformation bean;
		
		try(Session session = HibernateUtil.openSession()) {
		
		 bean = session.get(EmployeeNewInformation.class, id);
		}
	
		return bean;
	}

}
                                                                                                                                                     