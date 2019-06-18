package com.techchefs.javaapp.interfaces;

public class ICICI implements ATM{

	@Override
	public void validate() {
		System.out.println("IcICI validate");
		
	}

	@Override
	public void getInfo() {
		System.out.println("IcICI getinfo");
		
	}

}
