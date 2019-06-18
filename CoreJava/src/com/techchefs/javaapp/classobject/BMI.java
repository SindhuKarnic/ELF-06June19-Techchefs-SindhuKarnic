package com.techchefs.javaapp.classobject;

public class BMI {
double height;
double weight;
double calcBMI() {
	double bmi = weight / (height * height);
	return bmi;
}
void checkBMI(double bmi) {
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
}
