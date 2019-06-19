package com.techchefs.javaapp.collections;

import java.util.Arrays;

public class TestA {

	public static void main(String[] args) {
		double[] num = {2.3,6.7,3.2,1.1};
		/*
		 * double temp; int count = num.length; for(int i = 0; i < count; i ++) {
		 * for(int j = i+1; j < count; j ++) { if (num[i] > num[j]) { temp =num[i];
		 * num[i] = num[j]; num[j] = temp; } } }
		 */
		Arrays.sort(num);
		for(int i = 0; i < num.length; i ++) {
		System.out.println(num[i]);
		}
	}

}
