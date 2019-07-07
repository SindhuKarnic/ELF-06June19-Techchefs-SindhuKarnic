package com.techchefs.javaapp.stream;

import java.util.Comparator;
import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class StudentFilterIMPL {

	public static void main(String[] args) {

		Comparator<Student> c = (a, b) -> {
			if (a.age < b.age) {
				return -1;
			} else if (a.age > b.age) {
				return 1;
			} else {
				return 0;
			}
		};

		Student s1 = new Student("john", 12, 45, 45.5);
		Student s2 = new Student("anna", 42, 55, 55.5);
		Student s3 = new Student("sarah", 36, 65, 65.5);
		Student s4 = new Student("james", 25, 69, 67.5);
		Student s5 = new Student("joe", 22, 71, 75.5);
		TreeSet<Student> tr = new TreeSet<>(c);
		tr.add(s1);
		tr.add(s2);
		tr.add(s3);
		tr.add(s4);
		tr.add(s5);

		for (Student s : tr) {
			log.info("" + s);
		}
	}
}
