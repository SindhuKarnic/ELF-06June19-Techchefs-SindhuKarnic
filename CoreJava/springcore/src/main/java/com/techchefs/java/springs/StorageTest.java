package com.techchefs.java.springs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StorageTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(LaptopConfig.class);
		Laptop laptopBean=context.getBean(Laptop.class);
		laptopBean.display();
		laptopBean.process();
		laptopBean.showSpecification();
	}

}
