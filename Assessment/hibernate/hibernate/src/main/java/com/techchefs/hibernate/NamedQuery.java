package com.techchefs.hibernate;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.techchefs.hibernate.util.HibernateUtil;
//Question 6. Write a logic to get a Student detail with the help of rollNum and subject by using Named Queries.
import lombok.extern.java.Log;
@Log
public class NamedQuery {

	public static void main(String[] args) {
		Transaction trans = null;
		try(Session session = HibernateUtil.openSession()) {
			Query query = session.createQuery("from StudentBean where rollNum=: sroll and subject=: sub");
			query.setParameter("sroll", 1);
			query.setParameter("sub", "english");
			trans = session.beginTransaction();
			int rows = query.executeUpdate();
			trans.commit();
		} catch(Exception e) {
			log.info("Exception"+e);
			trans.rollback();
		}
	}

}
