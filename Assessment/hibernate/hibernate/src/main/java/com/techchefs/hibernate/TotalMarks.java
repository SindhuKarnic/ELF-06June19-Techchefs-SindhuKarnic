package com.techchefs.hibernate;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;
//Question 7. Write a logic to perform all aggregate(min,max,avg) function on total Marks Column in Student Entity Using HQL.

import com.techchefs.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class TotalMarks {

	public static void main(String[] args) {
		Transaction trans = null;
		try(Session session = HibernateUtil.openSession()) {
			Query query = session.createQuery("select max(totalMarks), min(totalMarks), avg(totalMarks), sum(totalMarks) from StudentBean");
			log.info("Avg"+query.getSingleResult());
		} catch(Exception e) {
			log.info("Exception"+e);
		}
	}

}
