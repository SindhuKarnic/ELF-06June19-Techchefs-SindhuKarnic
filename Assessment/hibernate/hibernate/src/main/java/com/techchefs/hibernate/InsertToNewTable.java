package com.techchefs.hibernate;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.techchefs.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;
//Question 3. Insert a data from existing table(Customer) to new table using HQL.

@Log
public class InsertToNewTable {

	public static void main(String[] args) {
		Transaction trans = null;
		try(Session session = HibernateUtil.openSession()) {
			Query query = session.createQuery("insert into NewCustomerBean(id, firstName, lastName, city) select id,firstName,lastName,city from CustomerBean where id = 1");
			trans = session.beginTransaction();
			int rows = query.executeUpdate();
			trans.commit();
		} catch(Exception e) {
			log.info("Exception"+e);
			trans.rollback();
		}
	}

}
