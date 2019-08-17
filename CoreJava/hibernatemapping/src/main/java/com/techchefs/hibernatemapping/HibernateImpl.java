package com.techchefs.hibernatemapping;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernatemapping.manytomany.TrainingInfoBean;
import com.techchefs.hibernatemapping.manytoone.EmployeeAddressInfo;
import com.techchefs.hibernatemapping.manytoone.EmployeeEducationalInfo;
import com.techchefs.hibernatemapping.manytoone.EmployeeExperienceInfoBean;

public class HibernateImpl {
	private Configuration config = new Configuration();
	private SessionFactory factory = config
			.configure()
			.buildSessionFactory();
	public void createEmp(EmployeeInfoBean infoBean, EmployeeOtherInfoBean otherInfo,
			List<EmployeeAddressInfo> addressinfo, List<EmployeeEducationalInfo> empEdu,
			List<EmployeeExperienceInfoBean> empExp) {
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(infoBean);
		session.save(otherInfo);
		for(EmployeeAddressInfo emp : addressinfo) {
			session.save(emp);
		}
		for(EmployeeEducationalInfo edu : empEdu) {
			session.save(edu);
		}
		for(EmployeeExperienceInfoBean exp : empExp) {
			session.save(exp);
		}
		trans.commit();
		session.close();
	}
	public void createTraining(TrainingInfoBean tbean) {
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(tbean);
		trans.commit();
		session.close();
	}
	public void createEmpForMgr(EmployeeInfoBean bean) {
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(bean);
		trans.commit();
		session.close();
	}
	
	public EmployeeInfoBean getEmployeeBean(int id) {
		Session session = factory.openSession();
		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);
		session.close();
		return bean;
	}
}
