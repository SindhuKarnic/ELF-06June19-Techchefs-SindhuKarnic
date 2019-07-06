package com.techchefs.designpattern.dao;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techchefs.designpattern.beans.EmployeeInfoBean;

public class EmployeeDAOHibernateImpl implements EmployeeDAO{

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
		//1) Load config file
		Configuration cfg = new Configuration(); 
		cfg.configure();
		
		//cfg.configure("Myhibernate.con.xml");
		//cfg.configure(new File("D://Myhibernate.con.xml"));
		/*
		 * try { cfg.configure(new URL(
		 * "https://raw.githubusercontent.com/SindhuKarnic/ELF-06June19-Techchefs-SindhuKarnic/master/CoreJava/Myhibernate.config.xml"
		 * )); } catch (HibernateException e) { e.printStackTrace(); } catch
		 * (MalformedURLException e) { e.printStackTrace(); }
		 */
		cfg.addAnnotatedClass(EmployeeInfoBean.class);

		//2)Build Session factory
		SessionFactory factory = cfg.buildSessionFactory(); 
		
		//3) Open session
		Session session = factory.openSession();
		
		//4)Operate with db via session
		EmployeeInfoBean empinf = session.get(EmployeeInfoBean.class, id);
		
		//5) Close session
		session.close();
		return empinf;
	}

}
