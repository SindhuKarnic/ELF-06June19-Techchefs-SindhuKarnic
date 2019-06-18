package com.techchefs.javaapp.conditions;

public class Factorial {
	static int factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i ++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		int fact = factorial(5);
		System.out.println("Factorial " +fact);

	}

}
