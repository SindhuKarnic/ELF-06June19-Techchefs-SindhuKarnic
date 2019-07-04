package com.techchefs.jdbcapplication.common;

public class MyClass {
	private MyClass() {}
	
	public static MyInterface getInstance(String st) {
		MyInterface ref = null;
		if( st.equals("one")) {
			ref = new ClassA();
		} else {
			ref = new ClassB();
		}
		return ref;
	}
}
