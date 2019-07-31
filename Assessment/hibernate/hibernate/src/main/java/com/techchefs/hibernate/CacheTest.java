package com.techchefs.hibernate;
//Question 9. WAP to enable second level caching for EmployeeInfoBean class.

import org.hibernate.Session;

import com.techchefs.hibernate.dto.EmployeeInfoBean;
import com.techchefs.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class CacheTest {
	public static EmployeeInfoBean secondLevel(int id) {
		EmployeeInfoBean bean = null;
		try(Session session = HibernateUtil.openSession()) {
			 bean = session.get(EmployeeInfoBean.class, id);
		}
		return bean;
		
	}
	public static void main(String[] args) {
		EmployeeInfoBean bean = secondLevel(1);
		EmployeeInfoBean bean1 = secondLevel(1);
		EmployeeInfoBean bean2 = secondLevel(1);
		log.info("bean"+bean.getName());
		log.info("bean1"+bean.getName());
		log.info("bean2"+bean.getName());
	}

}
