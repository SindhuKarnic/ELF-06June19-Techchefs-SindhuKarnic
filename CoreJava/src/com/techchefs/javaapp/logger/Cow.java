package com.techchefs.javaapp.logger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cow extends Animal{
	private static final Logger Loger = Logger.getLogger("Animal");
	void sound() {
		System.out.println("Cow sound");
		Loger.log(Level.INFO, "cow sound");
	}
	double division(int a, int b) {
		Loger.log(Level.INFO, "cow");
		return a / b;
	}
}
