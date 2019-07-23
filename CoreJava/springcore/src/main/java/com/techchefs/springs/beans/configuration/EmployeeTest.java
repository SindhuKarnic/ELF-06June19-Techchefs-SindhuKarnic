package com.techchefs.springs.beans.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techchefs.springcore.beans.MessageBean;

import lombok.extern.java.Log;

@Log
public class EmployeeTest {
	public static void main(String[] args) {
		ApplicationContext appCon = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee2 empbean = appCon.getBean(Employee2.class);
		DeptBean depbean = empbean.getDeptbean();
		log.info("eid " +empbean.getId());
		log.info("name " +empbean.getName());
		log.info("did " +depbean.getDeptId());
		log.info("name " +depbean.getDeptName());
	}
}
