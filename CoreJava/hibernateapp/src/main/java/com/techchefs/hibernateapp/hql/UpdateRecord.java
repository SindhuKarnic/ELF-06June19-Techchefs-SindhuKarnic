package com.techchefs.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.techchefs.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class UpdateRecord {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		//To update
		String hql = "update from EmployeeInfoBean set name='aaa' where id = 1"; 
		Query query = session.createQuery(hql);
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			int result = query.executeUpdate();
			log.info("rows " +result);
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}