package com.techchefs.javaapp.collections;

import java.util.Comparator;

public class EmployeeBySal implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		if (e1.salary > e2.salary) {
			return 1;
		} else if (e1.salary < e2.salary) {
			return -1;
		} else {
			return 0;
		}
	}
	
}
