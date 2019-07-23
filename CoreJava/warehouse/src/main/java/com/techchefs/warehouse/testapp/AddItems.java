package com.techchefs.warehouse.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techchefs.warehouse.beans.ItemsBean;
import com.techchefs.warehouse.config.ItemConfig;

public class AddItems {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ItemConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class); 
		Session session = factory.openSession();
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
