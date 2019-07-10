package com.techchefs.hibernateapp.criteria;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.techchefs.hibernatapp.dto.EmployeeInfoBean;
import com.techchefs.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class CallStroredProc {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		StoredProcedureQuery query = session.createStoredProcedureCall("employee_info_sp");
		List<Object[]> rs= query.getResultList();
		for(Object[] bean : rs) {
			log.info("Name " +bean[1]);
		}
	}

}
