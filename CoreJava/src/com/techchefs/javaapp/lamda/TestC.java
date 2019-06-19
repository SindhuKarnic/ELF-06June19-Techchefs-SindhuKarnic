package com.techchefs.javaapp.lamda;

interface Square {
	int sqr(int x);
}

public class TestC {

	public static void main(String[] args) {
		Square s = x -> x * x;
		int sq = s.sqr(2);
		System.out.println(sq);
	}

}
