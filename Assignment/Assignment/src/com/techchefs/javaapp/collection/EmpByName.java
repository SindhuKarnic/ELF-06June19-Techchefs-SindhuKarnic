package com.techchefs.javaapp.collection;

import java.util.Comparator;

public class EmpByName implements Comparator<EmployeeSort> {

	@Override
	public int compare(EmployeeSort o1, EmployeeSort o2) {
		return o1.name.compareTo(o2.name);
	}
	

}
