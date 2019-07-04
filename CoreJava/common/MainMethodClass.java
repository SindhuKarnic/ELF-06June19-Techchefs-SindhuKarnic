package com.techchefs.jdbcapplication.common;

public class MainMethodClass {

	public static void main(String[] args) {
		MyInterface ref = MyClass.getInstance(args[0]);
		ref.printMsg();
		
	}

}
