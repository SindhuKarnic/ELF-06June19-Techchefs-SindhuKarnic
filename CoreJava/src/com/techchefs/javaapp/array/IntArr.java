package com.techchefs.javaapp.array;

public class IntArr {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4};
		for (int i = 0; i < a.length; i ++) {
			System.out.println(a[i]);
		}
		char[] c = {'s','i','n','d','h','u'};
		for (int i = c.length-1; i >= 0; i --) {
			System.out.print(c[i]);
		}
	}
}
