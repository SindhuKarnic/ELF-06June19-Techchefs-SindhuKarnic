package com.techchefs.javaapp.collections;

import java.util.logging.Logger;

public class TestBean {
	private static final Logger  Loger = Logger.getLogger("BeanLog");
	public static void main(String[] args) {
		Employee2 e = new Employee2();
		Loger.info(e.toString());
		e.setId(1);
		e.setName("Sindhu"); 
		e.setSalary(12.6);
		Loger.info(e.getName());
	}

}
