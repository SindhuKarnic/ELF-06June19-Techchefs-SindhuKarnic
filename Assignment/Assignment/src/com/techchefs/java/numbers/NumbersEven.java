package com.techchefs.java.numbers;

public class NumbersEven {

	public static void main(String[] args) {
		for (int i = 50; i < 101; i ++) {
			if (i % 2 == 0 && i % 5 ==0) {
				System.out.println(i);
			}
		}
	}

}
