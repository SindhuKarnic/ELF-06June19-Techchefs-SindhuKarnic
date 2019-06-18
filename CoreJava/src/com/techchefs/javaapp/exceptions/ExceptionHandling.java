package com.techchefs.javaapp.exceptions;

public class ExceptionHandling {

	public static void main(String[] args) {
		int[] ar = new int[2];
		String n = null;
		try {
			
			double x = 10 / 2;
			System.out.println("divide by zero "+x);
			System.out.println("array access: "+ ar[0]);
			System.out.println("string length "+n.length());
			
		} catch(ArithmeticException ae) {
			System.out.println("Arithmetic exception "+ae);
		} catch(ArrayIndexOutOfBoundsException ab) {
			System.out.println("Array Index OutOf Bounds exception "+ab);
		} catch(NullPointerException ne) {
			System.out.println("Null Pointer Exception "+ne);
		} catch(Exception e) {
			System.out.println("general exception "+e);
		}

	}

}
