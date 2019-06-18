package com.techchefs.javaapp.exceptions;

public class UserDefException {

	public static void main(String[] args) {
		CheckName c = new CheckName();
		
		try {
			c.checkName("sin");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
