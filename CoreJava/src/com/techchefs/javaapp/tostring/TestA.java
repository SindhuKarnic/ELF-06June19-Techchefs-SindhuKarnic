package com.techchefs.javaapp.tostring;

public class TestA {

	public static void main(String[] args) {
		Student s = new Student(20, "sindhu",1.75);
		System.out.println(s);
		Student t = new Student(20, "sindhu", 1.75);
		System.out.println(s.equals(t));
		

	}

}
