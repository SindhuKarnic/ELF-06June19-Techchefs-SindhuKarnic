package com.techchefs.javaapp.basiccalculator;

public class BasicCalculator {
	public void add (int a, int b) {
		int c = a + b;
		System.out.println("addition " +c);
	}
	void sub (int a, int b) {
		int c = a - b;
		System.out.println("Substraction " +c);
	}
	void mul (int a, int b) {
		int c = a * b;
		System.out.println("Multiplication " +c);
	}
	void div (int a, int b) {
		double c = a / b;
		System.out.println("Division " +c);
	}
}
