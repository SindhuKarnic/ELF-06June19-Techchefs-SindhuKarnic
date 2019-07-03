package com.techchefs.java.lamda;

import java.util.function.Function;

import lombok.extern.java.Log;

@Log
public class TestSquare {

	public static void main(String[] args) {
		Function<Integer, Integer> f = a -> a * a;
		int sq = f.apply(2);
		log.info("" +sq);
	}

}
