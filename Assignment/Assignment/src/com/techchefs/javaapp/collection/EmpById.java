package com.techchefs.javaapp.collection;

import java.util.Comparator;

public class EmpById implements Comparator<EmployeeSort> {

	@Override
	public int compare(EmployeeSort o1, EmployeeSort o2) {
		if (o1.id > o2.id) {
			return 1;
		} else if (o1.id < o2.id) {
			return -1;
		} else {
			return 0;
		}
	}

}