package com.techchefs.javaapp.conditions;

public class percent {
	public static void main(String[] args) {
		double amt = 1000;
		int percent = 10;
		double discount = amt*(percent/100.0);
		int visited = 3;
		if (visited == 1) {
			amt = amt - discount;
		} else {

		}
		System.out.println("Amt after discount "+amt);
	}
}
