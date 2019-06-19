package com.techchefs.javaapp.collections;

public class ForEachArray {

	public static void main(String[] args) {
		int[] ar1 = {1,2,3,4};
		double[] ar2 = {1.1,3.4,5.6,1.2};
		String[] ar3 = {"ab", "xy", "tv"};
		System.out.println("integer array");
		for (int x : ar1) {
			System.out.println(x);
		}
		System.out.println("double array");
		for (double x : ar2) {
			System.out.println(x);
		}
		System.out.println("string array");
		for (String x : ar3) {
			System.out.println(x);
		}
	}

}
