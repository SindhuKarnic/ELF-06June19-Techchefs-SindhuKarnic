package com.techchefs.javaapp.exceptions;

public class Parent {
	void display() {
		try {
			double x = 10 / 2;
			System.out.println(x);
		} catch(ArithmeticException ae) {
			throw ae;
		}
	}
}
