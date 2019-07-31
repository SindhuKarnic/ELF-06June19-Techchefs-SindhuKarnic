package com.techchefs.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.techchefs.hibernate.dto.StudentBean;
import com.techchefs.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

//Question 5. Create an Entity with following details and write a logic to display firstName and totalMarks for all student.
@Log
public class StudentProjection {

	public static void main(String[] args) {
		Session session = HibernateUtil.openSession();
		Criteria criteria = session.createCriteria(StudentBean.class);
		Projection pro1 = Projections.property("firstName");
		Projection pro2 = Projections.property("totalMarks");
		ProjectionList prolist = Projections.projectionList();
		prolist.add(pro1);
		prolist.add(pro2);
		criteria.setProjection(prolist);
		List<Object[]> bean = criteria.list();
		for(Object[] b : bean) {
			log.info("name" +b[0]);
			log.info("total marks" +b[1]);
		}
	}

}
