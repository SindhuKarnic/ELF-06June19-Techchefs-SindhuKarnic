package com.techchefs.javaapp.exceptions;

public class CheckName {
	void checkName(String n) {
		if(n.length() >= 5) {
			System.out.println("Name " +n);
		} else {
			InvalidNameException e = new InvalidNameException("Invalid name");
			throw  e;
		}
	}
}
