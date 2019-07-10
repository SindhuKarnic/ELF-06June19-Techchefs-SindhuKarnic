package com.techchefs.javaapp.stream;
import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class EmployeeForEach {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Jim", 45000.0, 1.4, "developer");
		Employee e2 = new Employee(2, "james", 25000.0, 2.0, "developer");
		Employee e3 = new Employee(3, "anna", 5000.0, 0.4, "HR");
		Employee e4 = new Employee(5, "sarah", 35000.0, 2.4, "tester");
		Employee e5 = new Employee(4, "amy", 15000.0, 1.2, "tester");
		Employee e6 = new Employee(6, "john", 65000.0, 6.4, "HR");

		ArrayList<Employee> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		al.add(e6);

		for (Employee emp : al) {
			if (emp.experience >= 2)
				log.info("" + emp);
		}

	}
}
