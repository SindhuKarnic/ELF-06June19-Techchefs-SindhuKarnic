package com.techchefs.warehouse.testapp;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techchefs.warehouse.beans.ItemsBean;

public class TestUtil {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Session session = context.getBean("hibernateUtil", HibernateUtil.class).openSession();
		
		ItemsBean ib = new ItemsBean();
		ib.setItemId(1);
		ib.setItemName("cycle");
		ib.setCost(20);
		ib.setDescription("honda");
		ib.setCapacity(2);
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			session.saveOrUpdate(ib);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
		session.close();
	}
}
