package com.techchefs.hibernateapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.techchefs.hibernatapp.dto.EmployeeInfoBean;
import com.techchefs.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class GetDataWithProjections {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		// single projection
//		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
//		Projection pro = Projections.property("name");
//		criteria.setProjection(pro);
//		List<String> emp= criteria.list();
//		for(String empInfoBean : emp) {
//			log.info(" " +empInfoBean);
//		}
		
		//2 projections using projection list
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		Projection pro = Projections.property("name");
		Projection pro1 = Projections.property("id");
		ProjectionList projList = Projections.projectionList();
		projList.add(pro);
		projList.add(pro1);
		criteria.setProjection(projList);
		
		List<Object[]> emp= criteria.list();
		for(Object[] empInfoBean : emp) {
			log.info(" " +empInfoBean[0]);
			log.info(" " +empInfoBean[1]);
		}
		
	}

}
