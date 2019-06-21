package com.techchefs.javaapp.collections;

import java.util.Comparator;

public class EmployeeById implements Comparator<Employee1>{
	public int compare(Employee1 e1, Employee1 e2) {
		if (e1.id > e2.id) {
			return 1;
		} else if (e1.id < e2.id) {
			return -1;
		} else {
			return 0;
		}
	}
}
