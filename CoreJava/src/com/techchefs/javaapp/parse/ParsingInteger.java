package com.techchefs.javaapp.parse;

public class ParsingInteger {

	public static void main(String[] args) {
		String s = "123.23";
		String t = "true";
		//int x = Integer.parseInt(s);
		//System.out.println(x);
		double d = Double.parseDouble(s);
		System.out.println(d);
		boolean b = Boolean.parseBoolean(t);
		System.out.println(t);

	}

}
