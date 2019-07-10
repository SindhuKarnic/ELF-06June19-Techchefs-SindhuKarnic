package com.techchefs.hibernateapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.techchefs.hibernatapp.dto.EmployeeInfoBean;
import com.techchefs.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class GetDataWithRestrictions {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		//Single restriction in separate lines
//		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
//		Criterion cr = Restrictions.eq("id", 1);
//		criteria.add(cr);
		
		//2 restrictions
//		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
//		Criterion cr = Restrictions.gt("salary", 20000.0);
//		Criterion cr1 = Restrictions.eq("designation", "dev");
//		criteria.add(cr);
//		criteria.add(cr1);
		
		//3 code refactor
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class).add(Restrictions.gt("salary", 20000.0)).add(Restrictions.eq("designation", "dev"));
		
		List<EmployeeInfoBean> emp= criteria.list();
		for(EmployeeInfoBean empInfoBean : emp) {
			log.info("id " +empInfoBean);
		}
	}

}
