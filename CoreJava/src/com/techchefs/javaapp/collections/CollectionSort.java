package com.techchefs.javaapp.collections;

import java.util.Arrays;
import java.util.Collections;

public class CollectionSort {

	public static void main(String[] args) {
		Integer[] num = {5,2,1,4,3};
		Arrays.sort(num, Collections.reverseOrder());
		for(int i = 0; i < num.length; i ++) {
			System.out.println(num[i]);
		}
	}

}
