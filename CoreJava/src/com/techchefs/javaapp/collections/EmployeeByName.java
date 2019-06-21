package com.techchefs.javaapp.collections;

import java.util.Comparator;

public class EmployeeByName implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		return o1.name.compareTo(o2.name);
	}
	
}
