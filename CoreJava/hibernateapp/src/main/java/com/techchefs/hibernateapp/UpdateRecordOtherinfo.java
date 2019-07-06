package com.techchefs.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernatapp.dto.EmployeeOtherInfoBean;

public class UpdateRecordOtherinfo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		cfg.addAnnotatedClass(EmployeeOtherInfoBean.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		EmployeeOtherInfoBean empinf = session.get(EmployeeOtherInfoBean.class, 2);
		
		empinf.setFatherNm("hhhhuuuu");
		
		Transaction trans = session.beginTransaction();
		session.update(empinf);
		trans.commit();
		session.close();
	}

}
