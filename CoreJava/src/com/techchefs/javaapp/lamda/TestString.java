package com.techchefs.javaapp.lamda;

import java.util.function.Function;

import lombok.extern.java.Log;

@Log
public class TestString {

	public static void main(String[] args) {
		Function<String,Integer> f = s -> s.length();
		int l = f.apply("hello");
		log.info("" +l);
	}

}
