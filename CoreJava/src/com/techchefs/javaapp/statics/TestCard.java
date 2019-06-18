package com.techchefs.javaapp.statics;

public class TestCard {

	public static void main(String[] args) {
		Card j = new Card();
		Card a = new Card();
		j.swipe();
		a.swipe();
		a.swipe();
		j.swipe();
		System.out.println("Java count "+j.count);
		System.out.println("angular count "+a.count);
		System.out.println("org count "+Card.orgCount);

	}

}
