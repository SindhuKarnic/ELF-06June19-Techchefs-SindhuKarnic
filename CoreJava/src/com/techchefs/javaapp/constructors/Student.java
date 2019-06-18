package com.techchefs.javaapp.constructors;

public class Student {
 String name;
 int age;
 double percent;
 Student(String name, int age, double percent) {
	 this.name = name;
	 this.age = age;
	 this.percent = percent;
 }
 void display() {
	 System.out.println("name: "+name);
	 System.out.println("Age: "+age);
	 System.out.println("Percent: "+percent);
 }
}
