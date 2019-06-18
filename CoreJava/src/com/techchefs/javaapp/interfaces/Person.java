package com.techchefs.javaapp.interfaces;

public class Person implements Animal, Human{

	@Override
	public void walk() {
		System.out.println("Walking");
		
	}

	@Override
	public void eat() {
		System.out.println("Eating");
		
	}

}
