package com.techchefs.springcore;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techchefs.springcore.beans.Employee;

import lombok.extern.java.Log;
@Log
public class EmployeeTest {

	public static void main(String[] args) {
		//ApplicationContext appCon = new ClassPathXmlApplicationContext("bean.xml");
		ApplicationContext appCon = new ClassPathXmlApplicationContext("bean4.xml");
		Employee eobj = (Employee) appCon.getBean("emp");
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter");
		 * eobj.setId(sc.nextInt()); eobj.setName(sc.next()); Employee eobj1 =
		 * (Employee) appCon.getBean("emp"); System.out.println("Enter");
		 * eobj1.setId(sc.nextInt()); eobj1.setName(sc.next());
		 */
//		System.out.println(eobj.getId());
//		System.out.println(eobj.getName());
//		System.out.println(eobj1.getId());
//		System.out.println(eobj1.getName());
		log.info("" +eobj.getDeptbean().getDeptId());
		log.info("" +eobj.getDeptbean().getDeptName());
		((AbstractApplicationContext)appCon).close();
	}

}
