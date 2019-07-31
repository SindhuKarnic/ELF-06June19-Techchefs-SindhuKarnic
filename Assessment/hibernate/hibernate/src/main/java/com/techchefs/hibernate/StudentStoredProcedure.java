package com.techchefs.hibernate;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;

import com.techchefs.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;
//Create a store Procedure on student table and write a program to call the same stored Procedure using hibernate
@Log
public class StudentStoredProcedure {
	public static void main(String[] args) {
		try(Session session = HibernateUtil.openSession()) {
			StoredProcedureQuery storedProc = session.createStoredProcedureCall("StudentProcedure");
			List<Object[]> bean = storedProc.getResultList();
			for(Object[] b : bean) {
				log.info("Name " +b[1]);
			}
		} catch(Exception e) {
			log.info("Exception"+e);
		}
	}
}


