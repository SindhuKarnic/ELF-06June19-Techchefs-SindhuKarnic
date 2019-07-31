package com.techchefs.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.techchefs.hibernate.dto.CustomerBean;
import com.techchefs.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class CustomerCRUD implements CustomerDao{

	public void createCustomer(CustomerBean bean) {
		Transaction trans = null;
		try(Session session = HibernateUtil.openSession()) {
			trans = session.beginTransaction();
			session.save(bean);
			trans.commit();
		} catch(Exception e) {
			log.info("Exception"+e);
			trans.rollback();
		}
	}
	public void updateCustomer(int id) {
		Transaction trans = null;
		try(Session session = HibernateUtil.openSession()) {
			CustomerBean bean = session.get(CustomerBean.class, id);
			trans = session.beginTransaction();
			session.update(bean);
			trans.commit();
		} catch(Exception e) {
			log.info("Exception"+e);
			trans.rollback();
		}
	}
	public void deleteCustomer(int id) {
		Transaction trans = null;
		try(Session session = HibernateUtil.openSession()) {
			CustomerBean bean = session.get(CustomerBean.class, id);
			trans = session.beginTransaction();
			session.delete(bean);
			trans.commit();
		} catch(Exception e) {
			log.info("Exception"+e);
			trans.rollback();
		}
	}
	public CustomerBean readCustomer(int id) {
		try(Session session = HibernateUtil.openSession()) {
			CustomerBean bean = session.get(CustomerBean.class, id);
			return bean;
		} catch(Exception e) {
			log.info("Exception"+e);
			return null;
		}
	}
}
