package com.techchefs.javaapp.stream;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Student {

	String name;
	int age;
	int marks;
	double percentage;
	char gender;

	public Student(String name, int age, int marks, double percentage) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.percentage = percentage;
	}

}
