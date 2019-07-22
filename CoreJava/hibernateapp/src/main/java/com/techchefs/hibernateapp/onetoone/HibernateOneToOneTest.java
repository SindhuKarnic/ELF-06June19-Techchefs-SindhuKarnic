package com.techchefs.hibernateapp.onetoone;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.techchefs.hibernateapp.util.PrepareDataUtil;
import com.techchefs.hibernateapp.util.RefinedHibernateUtil;

import lombok.extern.java.Log;

@Log
public class HibernateOneToOneTest {
	public static void main(String[] args) {
		int id = 21;
		EmployeeInfoBean data = PrepareDataUtil.prepareData(id);
		save(data);
		
	}
	private static void save(EmployeeInfoBean data) {
		Transaction trans = null;
		try(Session session = RefinedHibernateUtil.getSession()) {
			 trans = session.beginTransaction();
			session.save(data);
			trans.commit();
		} catch(Exception e) {
			log.severe(Arrays.toString(e.getStackTrace()));
			if(trans != null) {
				trans.rollback();
			}
		}
	}
}
