package com.techchefs.javaapp.collections;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {

	public static void main(String[] args) {
		int[] num = {5,2,1,4,3};
		Arrays.sort(num);
		for(int i = 0; i < num.length; i ++) {
			System.out.println(num[i]);
		}
		int index = Arrays.binarySearch(num, 2);
		System.out.println("index of element " +index);
	}

}
