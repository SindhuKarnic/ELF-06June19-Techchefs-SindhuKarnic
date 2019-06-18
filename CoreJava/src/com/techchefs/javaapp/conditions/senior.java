package com.techchefs.javaapp.conditions;

public class senior {
public static void main(String[] args) {
	double amt = 1000;
	double percent = 15.25;
	double discount = amt * (percent/100.0);
	int age = 60;
	if (age >= 60) {
		amt = amt - discount;
	}
	System.out.println("Amt to be paid " + amt);
}
}
