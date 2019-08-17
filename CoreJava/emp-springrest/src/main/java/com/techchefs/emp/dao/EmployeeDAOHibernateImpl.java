
package com.techchefs.emp.dao;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.techchefs.emp.dto.EmployeeAddressInfo;
import com.techchefs.emp.dto.EmployeeEducationalInfo;
import com.techchefs.emp.dto.EmployeeExperienceInfoBean;
import com.techchefs.emp.dto.EmployeeInfoBean;
import com.techchefs.emp.dto.EmployeeOtherInfoBean;

import lombok.extern.java.Log;

@Log
public final class EmployeeDAOHibernateImpl implements EmployeeDAO{
	@Autowired
	private SessionFactory hibernateUtil;
	
	@Override
	public List<EmployeeInfoBean> getAllEmployeeInfo() {
		Session session = hibernateUtil.openSession();
		String hql = "from EmployeeInfoBean"; 
		Query query = session.createQuery(hql);
		List<EmployeeInfoBean> employeeInfoBeans = query.list(); 
		return employeeInfoBeans;		
	}
	
	  public List<EmployeeInfoBean> getAllSearchedEmployee(int id) {
	  
		  Session session = hibernateUtil.openSession(); 
		  String hql ="from EmployeeInfoBean where id like '" +id+ "%'"; 
		  Query query = session.createQuery(hql); List<EmployeeInfoBean> employeeInfoBeans =
		  query.list(); return employeeInfoBeans; 
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
		EmployeeInfoBean empinf = null;
		try(Session session = hibernateUtil.openSession();) {
			empinf = session.get(EmployeeInfoBean.class, id);
		}
		return empinf;
	}
	
	private boolean saveOrUpdate(EmployeeInfoBean bean) {
		Transaction tm = null;
		
		List<EmployeeAddressInfo> addinfo = bean.getAddressInfobean();
		 for(EmployeeAddressInfo ai : addinfo) {
			 ai.getEmpPK().setInfoBean(bean);
		 }
		 
		 List<EmployeeEducationalInfo> eduinfo = bean.getEduInfobean();
		 for(EmployeeEducationalInfo ei : eduinfo) {
			 ei.getEduPk().setInfoBean(bean);
		 }
		 
		 List<EmployeeExperienceInfoBean> expinfo = bean.getExpInfobean();
		 for(EmployeeExperienceInfoBean expinfobean : expinfo) {
			 expinfobean.getEmpExp().setInfoBean(bean);
		 }
		 EmployeeOtherInfoBean otherinfo = bean.getOtherInfo();
		 otherinfo.setInfobean(bean);
		//EmployeeInfoBean managerBean = getEmployeeInfo(bean.getManagerId().getId());
		// bean.setManagerId(managerBean);
		
		Session session = hibernateUtil.openSession();
		//try{
			tm = session.beginTransaction();
			session.saveOrUpdate(bean);
			tm.commit();
			
			 return true;
				 
				 
		//} catch (Exception e) {
//			log.severe(e.getMessage());
//			log.severe(e.getLocalizedMessage());
//			log.severe(Arrays.toString(e.getStackTrace()));
//			if(tm != null) {
//				tm.rollback();
//			}
//			return false;
		//}finally {
		//	session.close();
		//}
			
//		Transaction tm = null;
//		try(Session session = hibernateUtil.openSession();) {
//			tm = session.beginTransaction();
//			session.saveOrUpdate(bean);
//			tm.commit();
//			return true;
//		} catch (Exception e) {
//			log.severe(Arrays.toString(e.getStackTrace()));
//			if(tm != null) {
//				tm.rollback();
//			}
//			return false;
//		}
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
		//EmployeeInfoBean bean = new EmployeeInfoBean();
		//bean.setId(id);
		try {
			Session session = hibernateUtil.openSession();
			tm = session.beginTransaction();
			EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);
			session.delete(bean);
			tm.commit();
			session.close();
			return true;
		} catch (Exception e) {
			if(tm != null) {
				tm.rollback();
				
			}
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		return deleteEmployeeInfo(Integer.parseInt(id));
	}

}
