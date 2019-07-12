package com.techchefs.java.collectionstwo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestFive {

	static Five p=new Five();
	static ArrayList<Student> t=new ArrayList<Student>();
	static {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		s1.set("sam", 18, 67);
		s2.set("ana", 21, 77);
		s3.set("john", 21, 87);
		s4.set("sarah", 22, 96);
		
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
	
	}
	@Test
	void testTopper() {
		Double expecteds=96.00;
		Double actuals=p.getTopper(t);
		
		Assert.assertEquals(expecteds, actuals);
		
	}

}
