package com.techchefs.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techchefs.springcore.beans.CourseBean;

import lombok.extern.java.Log;

@Log
public class CourseTest {

	public static void main(String[] args) {
		ApplicationContext appCon = new ClassPathXmlApplicationContext("course.xml");
		CourseBean msgbean = (CourseBean) appCon.getBean("course");
		log.info(""+msgbean.getCourseId());
		log.info(""+msgbean.getName());
		log.info(""+msgbean.getFaculty());
		
	}

}
