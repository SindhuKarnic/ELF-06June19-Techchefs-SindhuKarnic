package com.techchefs.javaapp.collections;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student();
		s1.id = 1;
		s1.name = "Divya";
		s1.percent = 70;
		Student s2 = new Student();
		s2.id = 2;
		s2.name = "Anil";
		s2.percent = 60;
		Student s3 = new Student();
		s3.id = 3;
		s3.name = "Priya";
		s3.percent = 40;
		Student s4 = new Student();
		s4.id = 4;
		s4.name = "Manu";
		s4.percent = 40;
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		for(int i =0;i<al.size();i++) {
			Student s = al.get(i);
			System.out.println("Name " +s.name+ " id: "+s.id+" percent: "+s.percent );
		}
		
		
	}

}