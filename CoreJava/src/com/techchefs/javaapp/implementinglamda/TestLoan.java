package com.techchefs.javaapp.implementinglamda;

import lombok.extern.java.Log;

@Log
public class TestLoan {

	public static void main(String[] args) {
		Loan l = Loan.HOME;
		
		int constvalue = l.getValue();
		log.info("" +constvalue);
	}

}
