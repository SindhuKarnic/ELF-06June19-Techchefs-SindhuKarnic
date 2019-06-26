package com.techchefs.javaapp.lamda;

import java.util.function.Predicate;

import lombok.extern.java.Log;

@Log
public class TestPredicate {

	public static void main(String[] args) {
		Predicate<Integer> p = a -> a % 2 == 0;
		boolean b = p.test(15);
		log.info("" +b);
	}

}
