package com.techchefs.java.assessment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

/**
 * 
 * @author Sindhu
 * WAP to find the count of only passed female candidates of the class. (Using Lambda and Stream)
 */
@Log
public class TestFemaleCount {

	public static void main(String[] args) {
		//Passing marks considered as 50
		Student s1 = new Student("Anna", "female", 1, 60);
		Student s2 = new Student("John", "male", 2, 70);
		Student s3 = new Student("Amy", "female", 3, 40);
		Student s4 = new Student("Tom", "male", 4, 80);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		List<Student> st = al.stream().filter(s -> s.getGender() == "female" && s.getMarks() >= 50).collect(Collectors.toList());
		
		long countFemale = st.stream().count();
		log.info("Count of passed female candidates " +countFemale);
	}

}
