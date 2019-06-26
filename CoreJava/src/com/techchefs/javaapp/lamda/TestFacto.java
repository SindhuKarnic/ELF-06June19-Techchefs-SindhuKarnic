package com.techchefs.javaapp.lamda;

import lombok.extern.java.Log;

@Log
public class TestFacto {

	public static void main(String[] args) {
		FactorialInterface fi = new Average() :: calFact;
		log.info("factorial " +fi.facto(5));
		
	}

}
