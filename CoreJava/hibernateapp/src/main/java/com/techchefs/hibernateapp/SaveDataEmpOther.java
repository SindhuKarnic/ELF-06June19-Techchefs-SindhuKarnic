package com.techchefs.hibernateapp;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernatapp.dto.EmployeeOtherInfoBean;

public class SaveDataEmpOther {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeOtherInfoBean.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		EmployeeOtherInfoBean empinf = new EmployeeOtherInfoBean();
		
		empinf.setId(2);
		empinf.setPan("ABCD12222");
		empinf.setIsmarried(true);
		empinf.setBloodGroup("o+ve");
		empinf.setIschallenged(false);
		empinf.setEmergencyContactName("abc");
		empinf.setEmergencyContactNumber(122222222);
		empinf.setNationality("indian");
		empinf.setReligion("hindu");
		empinf.setFatherNm("xyz");
		empinf.setMotherNm("pqr");
		empinf.setSpouseNm("ttt");
		empinf.setPassport("duvjdghsjdhsj273238");
		empinf.setAdhar(1222222222);
		
		Transaction trans = session.beginTransaction();
		session.save(empinf);
		trans.commit();
		session.close();
		
	}

}
