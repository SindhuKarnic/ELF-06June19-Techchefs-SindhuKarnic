package com.techchefs.javaapp.lamda;

import java.util.function.Predicate;

import lombok.extern.java.Log;

@Log
public class TestPredicateArray {

	public static void main(String[] args) {
		int ar[] = {2,5,9,6,4,3};
		Predicate<Integer> p = a -> a % 2 != 0;
		for(int i = 0; i < ar.length; i++) {
			if(p.test(ar[i])) {
				log.info("" +ar[i]);
			}
		}
	}

}
