package com.techchefs.javaapp.stream;

import java.util.ArrayList;

public class StudentEnumIMPL {

	public static void main(String[] args) {

		Student s1 = new Student("jim", 12, 42, 25.5, 'm');
		Student s2 = new Student("anna", 42, 55, 55.5, 'f');
		Student s3 = new Student("james", 36, 65, 65.5, 'm');
		Student s4 = new Student("jack", 25, 69, 67.5, 'm');
		Student s5 = new Student("sarah", 22, 71, 75.5, 'm');

		Gender g = Gender.MALE;
		Gender g2 = Gender.FEMALE;

		char ch = g.getGender();

		ArrayList<Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
	}
}
