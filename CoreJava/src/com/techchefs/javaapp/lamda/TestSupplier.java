package com.techchefs.javaapp.lamda;

import java.util.function.Supplier;

import lombok.extern.java.Log;

@Log
public class TestSupplier {

	public static void main(String[] args) {
		//Supplier<Gun> s = () -> new Gun(100);
		Supplier<Gun> s = () -> new Gun();
		Gun g = s.get();
		log.info("" +g);
	}

}
