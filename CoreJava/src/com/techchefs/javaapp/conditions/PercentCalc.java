package com.techchefs.javaapp.conditions;

public class PercentCalc {
static double percent (double total, double obtained) {
	return (obtained / total) * 100;
}
public static void main(String[] args) {
	double percentage = percent(120, 80);
	System.out.println(percentage);
}
}
