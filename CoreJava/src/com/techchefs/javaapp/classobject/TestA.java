package com.techchefs.javaapp.classobject;

public class TestA {
	public static void main(String[] args) {
		/*
		 * Person p = new Person(); Mobile m = new Mobile(); p.m.call(); p.walk();
		 */
		Car c = new Car();
		c.drive();
		System.out.println("Modal of stereo "+c.s.modalNo);
		c.s.play();
	}
	
	
}
