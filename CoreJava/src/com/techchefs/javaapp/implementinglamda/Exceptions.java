package com.techchefs.javaapp.implementinglamda;

import lombok.extern.java.Log;

@Log
public class Exceptions {

	public static void main(String[] args) {
		try {
			
		} catch(ArithmeticException | NullPointerException e) {
			log.info("" +e.getMessage());
		} catch(Exception e) {
			log.info("General catch block");
		}
	}

}
