package com.techchefs.javaapp.lamda;

import java.util.function.Function;

import lombok.extern.java.Log;

@Log
public class TestFunction {

	public static void main(String[] args) {
		Function<Double, Double> f = r -> 3.14 * r * r;
		double d = f.apply(5.2);
		log.info("" +d);
	}

}
