package com.techchefs.javaapp.conditions;

public class LargestThree {
	public static void main(String[] args) {
		int a = 10;
		int b = 80;
		int c = 30;
		if (a > b && a > c) {
			System.out.println("Largest number " +a);
		} else if (b > a && b > c) {
			System.out.println("Largest number " +b);
		} else {
			System.out.println("Largest number "+c);
		}
	}
}
