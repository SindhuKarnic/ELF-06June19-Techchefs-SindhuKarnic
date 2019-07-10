package com.techchefs.javaapp.collection;

import java.util.Comparator;

public class EmpBySal implements Comparator<EmployeeSort> {

	@Override
	public int compare(EmployeeSort o1, EmployeeSort o2) {
		if (o1.sal > o2.sal) {
			return 1;
		} else if (o1.sal < o2.sal) {
			return -1;
		} else {
			return 0;
		}
	}

}
