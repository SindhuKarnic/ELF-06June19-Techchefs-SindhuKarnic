package com.techchefs.javaapp.implementinglamda;

import java.util.Comparator;
import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "A" , 2000.2);
		Employee e2 = new Employee(2, "B" , 2400.2);
		Employee e3 = new Employee(3, "C" , 1200.2);
		Employee e4 = new Employee(4, "D" , 2800.2);
		

		Comparator<Employee> c = (e,f) -> {
			if (e.id > f.id) {
				return 1;
			} else if (e.id < f.id) {
				return -1;
			} else {
				return 0;
			}
		};
		Comparator<Employee> c2 = (e,f) -> e.name.compareTo(f.name);
		TreeSet<Employee> ts = new TreeSet<Employee>(c2);
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		for (Employee e : ts) {
			log.info("Name " +e.name);
			log.info("Id " +e.id);
			log.info("Salary  " +e.salary);
			log.info("-------------");
		}
		
	}

} 
