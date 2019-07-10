
package com.techchefs.designpattern.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.techchefs.designpattern.beans.EmployeeInfoBean;
import com.techchefs.designpattern.util.HibernateUtil;

public class EmployeeDAOHibernateImpl2 implements EmployeeDAO{

	@Override
	public List<EmployeeInfoBean> getAllEmployeeInfo() {
		Session session = HibernateUtil.openSession();
		String hql = "from EmployeeInfoBean"; 
		Query query = session.createQuery(hql);
		List<EmployeeInfoBean> employeeInfoBeans = query.list(); 
		return employeeInfoBeans;		
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {
		try {
			return getEmployeeInfo(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {
		
		Session session = HibernateUtil.openSession();
	
		EmployeeInfoBean empinf = session.get(EmployeeInfoBean.class, id);
	
		session.close();
		return empinf;
	}
	
	private boolean saveOrUpdate(EmployeeInfoBean bean) {
		Transaction tm = null;
		try {
			Session session = HibernateUtil.openSession();
			tm = session.beginTransaction();
			session.saveOrUpdate(bean);
			tm.commit();
			return true;
		} catch (Exception e) {
			tm.rollback();
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		Transaction tm = null;
		EmployeeInfoBean bean = new EmployeeInfoBean();
		bean.setId(id);
		try {
			Session session = HibernateUtil.openSession();
			tm = session.beginTransaction();
			session.delete(bean);
			tm.commit();
			return true;
		} catch (Exception e) {
			tm.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		return deleteEmployeeInfo(Integer.parseInt(id));
	}

}
