package com.techchefs.javaapp.collection;

import java.util.TreeSet;
import java.util.logging.Logger;

public class TreeSetEmp {
	private static final Logger log=Logger.getLogger("myLog");

	void test(TreeSet<EmployeeSort> t) {

	EmployeeSort e1=new EmployeeSort();
	e1.name="tom";
	e1.id=1;
	e1.sal=20000;
	
	EmployeeSort e2=new EmployeeSort();
	e2.name="anna";
	e2.id=2;
	e2.sal=25000;
	
	EmployeeSort e3=new EmployeeSort();
	e3.name="sarah";
	e3.id=3;
	e3.sal=25000;
	
	EmployeeSort e4=new EmployeeSort();
	e4.name="james";
	e4.id=4;
	e4.sal=30000;

	t.add(e1);
	t.add(e2);
	t.add(e3);
	t.add(e4);
	
	for (EmployeeSort e : t) {
		log.info("name=" + e.name+" id=" + e.id+" salary="+e.sal);
	}

}
}
