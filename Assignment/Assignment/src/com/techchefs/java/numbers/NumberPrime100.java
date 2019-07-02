package com.techchefs.java.numbers;

public class NumberPrime100 {

	public static void main(String[] args) {
		System.out.println("2");
		int flag;
		for(int i = 3; i < 101; i ++) {
			flag = 0;
			for (int j = 2; j < i; j ++) {
				if (i % j == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(i);
			}
		}

	}

}
