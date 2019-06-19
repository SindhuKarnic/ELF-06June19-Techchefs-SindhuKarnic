package com.techchefs.javaapp.collections;

public class TestB {

	public static void main(String[] args) {
		Employee emp[] = new Employee[4];
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("AB");
		e1.setSalary(2.2);
		emp[0] = e1;
		Employee e2 = new Employee();
		e2.setId(2);
		e2.setName("BC");
		e2.setSalary(2.4);
		emp[1] = e2;
		Employee e3 = new Employee();
		e3.setId(3);
		e3.setName("CD");
		e3.setSalary(5.2);
		emp[2] = e3;
		Employee e4 = new Employee();
		e4.setId(4);
		e4.setName("DE");
		e4.setSalary(1.2);
		emp[3] = e4;
		
		for (Employee e : emp) {
			System.out.println("Name:" +e.getName());
			System.out.println("Id:" +e.getId());
			System.out.println("Sal:" +e.getSalary());
		}
	}

}
