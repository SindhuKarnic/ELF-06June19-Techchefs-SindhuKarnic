package com.techchefs.javaapp.collections;

import java.util.TreeSet;

public class TestEmployeeById {

	public static void main(String[] args) {
		EmployeeById r = new EmployeeById();
		EmployeeBySal s = new EmployeeBySal();
		EmployeeByName n = new EmployeeByName();
		TreeSet<Employee1> ts = new TreeSet<Employee1>(n);
		Employee1 c1 = new Employee1();
		c1.name = "abc";
		c1.id = 1;
		c1.salary = 20000;
		
		
		Employee1 c2 = new Employee1();
		c2.name = "qw";
		c2.id = 2;
		c2.salary = 26000;
		
		Employee1 c3 = new Employee1();
		c3.name = "rr";
		c3.id = 3;
		c3.salary = 10000;
		
		Employee1 c4 = new Employee1();
		c4.name = "aaa";
		c4.id = 4;
		c4.salary = 70000;
		
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		
		for(Employee1 c : ts) {
			System.out.println("Name: " +c.name+ " ID: " +c.id+ " salary: " +c.salary);
		}
		
	}

}
