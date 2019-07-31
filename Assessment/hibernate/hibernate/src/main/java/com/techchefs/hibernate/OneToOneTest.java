package com.techchefs.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.techchefs.hibernate.dto.StudentInfoBean;
import com.techchefs.hibernate.dto.StudentOtherInfoBean;
import com.techchefs.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;
//Question 10. Establish a relationship between following Entities, Using Hibernate Annotations (One-To-One).
@Log
public class OneToOneTest {

	public static void main(String[] args) {
		StudentInfoBean bean = new StudentInfoBean();
		bean.setRollNum(1);
		bean.setName("sindhu");
		bean.setAge(20);
		bean.setGender("female");
		bean.setEmailId("sindhu@mail.com");
		bean.setMobileNo(1111111);
		
		StudentOtherInfoBean otherBean = new StudentOtherInfoBean();
		otherBean.setRollNum(1);
		otherBean.setFatherName("abc");
		otherBean.setMotherName("xyz");
		otherBean.setNationality("indian");
		otherBean.setReligion("hindu");
		bean.setOtherInfo(otherBean);
		
		Transaction trans = null;
		try(Session session = HibernateUtil.openSession()) {
			trans = session.beginTransaction();
			session.save(bean);
			trans.commit();
		} catch(Exception e) {
			log.info("Exception"+e);
			trans.rollback();
		}
	}

}
