package com.techchefs.java.assessment;

public class Student {
	private String name;
	private String gender;
	private int id;
	private double marks; 
	public Student(String name, String gender, int id, int marks) {
		this.name = name;
		this.gender = gender;
		this.id = id;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getId() {
		return id;
	}
	public double getMarks() {
		return marks;
	}
	
	
	
}
