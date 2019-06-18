package com.techchefs.javaapp.interfaces;

public class SBI implements ATM{

	@Override
	public void validate() {
		System.out.println("SBI validate");
		
	}

	@Override
	public void getInfo() {
		System.out.println("SBI getinfo");
	}

}
