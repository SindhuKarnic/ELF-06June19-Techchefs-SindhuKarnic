package com.techchefs.java.numbers;
import java.util.Scanner;

public class NumberPrime {

	public static void main(String[] args) {
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == 0 || n == 1) {
			System.out.println("Not prime");
		} else {
			for (int i = 2; i < n; i ++) {
				if (n % i == 0) {
					System.out.println("Not prime");
					flag = 1;
					break;
				}
			}
		}
		if (flag == 0) {
			System.out.println("Prime");
		}

	}

}
