package com.techchefs.javaapp.lamda;

import java.util.function.Predicate;

import lombok.extern.java.Log;

@Log
public class TestPredicateString {

	public static void main(String[] args) {
		Predicate<String> st = s -> s.length() >= 5;
		boolean b = st.test("heloo");
		log.info("" +b);
	}

}
