package com.techchefs.designpattern;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.techchefs.designpattern.beans.EmployeeInfoBean;
import com.techchefs.designpattern.dao.EmployeeDAO;
import com.techchefs.designpattern.dao.EmployeeDAOFactory;
import com.techchefs.designpattern.dao.EmployeeDAOHibernateImpl;
import com.techchefs.designpattern.dao.EmployeeDAOJDBCmpl;

import lombok.extern.java.Log;

/**
 * 
 *
 */
@Log
public class DesignPatternsTest {
	private static void printData(EmployeeInfoBean bean) {
		log.info("Id " + bean.getId());
		log.info("name " + bean.getName());
		log.info("Age " + bean.getAge());
		log.info("Acc num " + bean.getAccountNumber());
		log.info("mangr id " + bean.getManagerId());
		log.info("dept id " + bean.getDepartmentId());
		log.info("gender " + bean.getGender());
		log.info("phone " + bean.getPhone());
		log.info("salary " + bean.getSalary());
		log.info("joining date " + bean.getJoiningDate());
		log.info("DOB " + bean.getDob());
		log.info("designation " + bean.getDesignation());
		log.info("Email " + bean.getEmail());
	}

	public static void main(String[] args) throws ParseException {

		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		//EmployeeInfoBean empinf = new EmployeeInfoBean();
		List<EmployeeInfoBean> beans = dao.getAllEmployeeInfo(); 
		for(EmployeeInfoBean bean : beans) {
		  printData(bean); 
		  }
		 
		 
		/*
		 * SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd"); Date date = null;
		 * date = form.parse("1993-04-03"); empinf.setId(21);
		 * empinf.setName("harryyyy"); empinf.setDepartmentId(103);
		 * empinf.setDesignation("dev"); empinf.setDob(date);
		 * empinf.setEmail("harryyyy@mail.com"); empinf.setGender("male");
		 * empinf.setJoiningDate(date); empinf.setManagerId(4);
		 * empinf.setPhone(22222222); empinf.setSalary(25000);
		 * empinf.setAccountNumber(11111111); empinf.setAge(25);
		 * //dao.createEmployeeInfo(empinf); dao.deleteEmployeeInfo(21);
		 */
		
		
		
		// EmployeeDAO dao = new EmployeeDAOHibernateImpl();
		//printData(dao.getEmployeeInfo("3"));
		/*
		 * EmployeeDAO dao = new EmployeeDAOJDBCmpl(); ArrayList<EmployeeInfoBean> beans
		 * = dao.getAllEmployeeInfo(); for(EmployeeInfoBean bean : beans) {
		 * printData(bean); }
		 */
		// log.info("========================================================");
		// printData(dao.getEmployeeInfo("3"));
	}
}
