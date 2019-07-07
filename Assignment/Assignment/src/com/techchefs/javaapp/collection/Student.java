package com.techchefs.javaapp.collection;
import java.util.logging.Logger;

public class Student {
	private static final Logger log=Logger.getLogger("myLog");

	String name;
	int age;
	double marks;

	void set(String name, int age, double marks) {
		this.name = name;
		this.age = age;
		this.marks = marks;

	}

	void get() {
		log.info(""+name);
		log.info(""+age);
		log.info(""+marks);
	}

}
