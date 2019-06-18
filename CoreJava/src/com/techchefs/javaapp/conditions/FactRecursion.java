package com.techchefs.javaapp.conditions;

public class FactRecursion {
 static int factorial(int num) {
	 if (num == 0) {
		 return 1;
	 }
	 return num * factorial(num -1);
 }
 public static void main(String[] args) {
	int fact = factorial(5);
	System.out.println(fact);
}
}
