
package com.techchefs.designpattern.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.techchefs.designpattern.beans.EmployeeInfoBean;
import com.techchefs.designpattern.util.HibernateUtil;

public class EmployeeDAOHibernateImpl2 implements EmployeeDAO{

	@Override
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		//TO DO
		return null;
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
