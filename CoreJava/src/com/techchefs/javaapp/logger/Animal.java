package com.techchefs.javaapp.logger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Animal {
	private static final Logger Loger = Logger.getLogger("Animal");
	
	void sound() {
		System.out.println("Animal sound");
		Loger.log(Level.INFO, "animal sound");
	}
	double division(int a, int b) {
		Loger.log(Level.INFO, "animal");
		return a / b;
	}
}
