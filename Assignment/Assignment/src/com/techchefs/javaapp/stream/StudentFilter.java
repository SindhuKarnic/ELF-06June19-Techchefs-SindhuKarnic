package com.techchefs.javaapp.stream;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class StudentFilter {

	public static void main(String[] args) {

		Student s1 = new Student("sarah", 12, 42, 45.5);
		Student s2 = new Student("amy", 42, 55, 55.5);
		Student s3 = new Student("jack", 36, 65, 65.5);
		Student s4 = new Student("james", 25, 69, 67.5);
		Student s5 = new Student("anna", 22, 71, 75.5);
		ArrayList<Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);

		al.stream().forEach(s -> log.info("" + s));
	}
}
