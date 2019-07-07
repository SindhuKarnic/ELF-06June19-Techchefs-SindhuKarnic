package com.techchefs.javaapp.stream;
import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class FilterEmployeeByExp {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "jim", 45000.0, 1.4, "sofware engineer");
		Employee e2 = new Employee(2, "sarah", 25000.0, 2.0, "sofware developer");
		Employee e3 = new Employee(3, "jack", 5000.0, 0.4, "IPs officer");
		Employee e4 = new Employee(5, "joe", 35000.0, 2.4, "tester");
		Employee e5 = new Employee(4, "anna", 15000.0, 1.2, "unit tester");
		Employee e6 = new Employee(6, "amy", 65000.0, 6.4, "software engineer");

		ArrayList<Employee> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		al.add(e6);

		al.stream().forEach(i -> log.info("" + i));

	}
}
