package com.techchefs.javaapp.array;

public class StringArray {
	public static void main(String[] args) {
		String[] st = new String[3];
		st[0] = "Sindhu";
		st[1] = "Name1";
		st[2] = "Name2";
		System.out.println(st.length);
		for(int i = 0; i < 3; i ++) {
			System.out.println(st[i]);
		}
	}
}
