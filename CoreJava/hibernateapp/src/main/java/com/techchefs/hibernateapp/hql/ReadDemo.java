package com.techchefs.hibernateapp.hql;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.techchefs.hibernatapp.dto.EmployeeInfoBean;
import com.techchefs.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class ReadDemo {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		//To get employee name
		String hql = "select name from EmployeeInfoBean"; 
		Query query = session.createQuery(hql);
		List<String> ename = query.list();
		for(String empname: ename) { 
			log.info("name " +empname);
		}
		//To get all employees
		/*
		 * String hql = "from EmployeeInfoBean"; Query query = session.createQuery(hql);
		 * List<EmployeeInfoBean> employeeInfoBeans = query.list(); for(EmployeeInfoBean
		 * employeeInfoBean : employeeInfoBeans) { log.info("name "
		 * +employeeInfoBean.getName()); log.info("Id " +employeeInfoBean.getId());
		 * log.info("name " +employeeInfoBean.getAge());
		 * 
		 * }
		 */
	}

}
