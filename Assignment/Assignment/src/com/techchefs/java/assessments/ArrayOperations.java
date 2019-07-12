package com.techchefs.java.assessments;
import java.util.Arrays;

import lombok.extern.java.Log;

@Log
public class ArrayOperations {

	public static void main(String[] args) {
		int[] arr = { 3, 6, 0, 12, 45, 7, 34 };
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 8 };
		int searchEle = 7;
		boolean flag = arr.equals(arr1);
		if (flag) {
			log.info("Arrays are equal");
		} else {
			log.info("Arrays are not equal");
		}
		System.arraycopy(arr1, 2, arr, 3, 4);
		for (int i : arr) {
			log.info("" + i);
		}
	}

}
