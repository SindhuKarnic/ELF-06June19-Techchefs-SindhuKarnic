package com.techchefs.javaapp.conditions;

public class Grade {
	public static void main(String[] args) {
		double percent = 90;
		char grade;
		if ( percent >= 90 && percent <= 100) {
			grade = 'A';
		} else if ( percent >= 80 && percent < 90) {
			grade = 'B';
		} else if ( percent >= 70 && percent < 80) {
			grade = 'C';
		} else if ( percent >= 60 && percent < 70) {
			grade = 'D';
		} else if ( percent >= 50 && percent < 60) {
			grade = 'E';
		} else {
			grade = 'F';
		}
		System.out.println("Grade: " +grade);
	}
}
