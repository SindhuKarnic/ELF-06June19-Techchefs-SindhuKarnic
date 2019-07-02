package com.techchefs.java.junit;

public class Factorial {
	public int calculateFact(int n) {
		int fact = 1;
		for(int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
