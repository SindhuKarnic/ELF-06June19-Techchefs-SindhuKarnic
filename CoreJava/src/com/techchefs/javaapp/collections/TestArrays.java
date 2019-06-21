package com.techchefs.javaapp.collections;

public class TestArrays {

	public static void main(String[] args) {
		int a[] = {5,6,2,1,4};
		int b[] = {30,40,50,60,20,80};
		int sourceIndex = 2;
		int numberOfElements = 3;
		/*
		 * int count = 0; for(int i = 2; i < b.length; i++) { if(count !=
		 * numberOfElements) { b[i] = a[sourceIndex++]; count ++; } } for(int l = 0; l <
		 * b.length; l ++) { System.out.print(b[l]+ " "); }
		 */
		System.arraycopy(a, 2, b, 2, 3);
		for(int l = 0; l <  b.length; l ++) { 
			System.out.print(b[l]+ " ");
		
		}
	}

}
