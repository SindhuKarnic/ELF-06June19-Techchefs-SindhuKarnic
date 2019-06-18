package com.techchefs.javaapp.conditions;

public class BMIFunction {
	static double calcBMI(double h, double w) {
		return w / (h * h);
	}
	static void checkBMI(double bmi) {
		if (bmi <= 18.5) {
			System.out.println("Under weight");
		} else if (bmi > 18.5 && bmi <= 24.5) {
			System.out.println("Normal");
		} else if (bmi > 25 && bmi <= 29.9) {
			System.out.println("Overweight");
		} else {
			System.out.println("Obese");
		}
	}
	public static void main(String[] args) {
		double height = 1.75;
		double weight = 70;
		double BMI = calcBMI(height,weight);
		System.out.println("BMI: " +BMI);
		checkBMI(BMI);
	}
}
