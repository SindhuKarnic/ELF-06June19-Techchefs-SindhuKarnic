package com.techchefs.javaapp.lamda;

import lombok.extern.java.Log;

@Log
public class TestStatic {
	
	public static void main(String[] args) {
		SumInterface s = Demo :: sum;
		int i = s.add(2,3);
		log.info("" +i);
	}

}
