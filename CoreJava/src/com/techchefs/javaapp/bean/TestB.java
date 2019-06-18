package com.techchefs.javaapp.bean;




public class TestB {

	public static void main(String[] args) {
		/*
		 * Person p = new Person(); p.setName("Name"); p.setAge(20); Db1 d1 = new Db1();
		 * Db2 d2 = new Db2(); d1.receive(p); d2.receive(p);
		 */
		Employee e = new Employee();
		e.setAge(20);
		e.setEmpName("sindhu");
		e.setGender('F');
		Company c = new Company();
		c.receive(e);
	}

}
