package com.techchefs.java.lamda;

interface Sum {
	int add(int a, int b);
}

public class TestAdd {

	public static void main(String[] args) {
		Sum s = (a,b) -> a+b;
		int i = s.add(5, 2);
		System.out.println(i);
	}

}
