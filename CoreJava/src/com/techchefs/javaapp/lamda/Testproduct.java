package com.techchefs.javaapp.lamda;

import lombok.extern.java.Log;

@Log
public class Testproduct {

	public static void main(String[] args) {
		ProductInterface pi = Product :: new;
		Product p = pi.getDetails("sss", 12.2);
		log.info("name " +p.name+ " cost " +p.cost);
	}

}
