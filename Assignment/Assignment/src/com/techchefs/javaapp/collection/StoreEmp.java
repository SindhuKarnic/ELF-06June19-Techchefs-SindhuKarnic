package com.techchefs.javaapp.collection;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.logging.Logger;


public class StoreEmp {
	private static final Logger log=Logger.getLogger("myLog");

	public static void main(String[] args) {
		ArrayList<Employees> t = new ArrayList<Employees>();
		Employees e1 = new Employees();
		e1.name = "Sam";
		e1.id = 1;
		e1.salary = 20000;

		Employees e2 = new Employees();
		e2.name = "sarah";
		e2.id = 2;
		e2.salary = 25000;

		Employees e3 = new Employees();
		e3.name = "anna";
		e3.id = 3;
		e3.salary = 20000;

		Employees e4 = new Employees();
		e4.name = "amy";
		e4.id = 4;
		e4.salary = 30000;

		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);

		for (Employees e : t) {
			log.info("name=" + e.name + " id=" + e.id + " salary=" + e.salary);
		}

	}
}
