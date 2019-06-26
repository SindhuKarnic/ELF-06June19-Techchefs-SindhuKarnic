package com.techchefs.javaapp.lamda;

import lombok.extern.java.Log;

@Log
public class TestBoy {

	public static void main(String[] args) {
		MyBoy b = Boy :: new;
		Boy b1 = b.getBoy("sss", 12.2, 12);
		log.info("" +b1.name+ " " +b1.age+ " "+b1.height);
	}

}
