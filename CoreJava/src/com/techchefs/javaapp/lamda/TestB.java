package com.techchefs.javaapp.lamda;

interface Facto {
	int fact(int x);
}

public class TestB {

	public static void main(String[] args) {
		Facto f = x -> {
			int j = 1;
			for(int i = 1; i <= x; i ++) {
				j = j * i;
			}
			return j;
		};
		int fac = f.fact(5);
		System.out.println(fac);
	}

}
