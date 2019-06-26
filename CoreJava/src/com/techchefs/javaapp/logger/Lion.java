package com.techchefs.javaapp.logger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lion extends Animal{
	private static final Logger Loger = Logger.getLogger("Animal");
	void sound() {
		System.out.println("lion sound");
		Loger.log(Level.INFO, "lion sound");
	}
	double division(int a, int b) {
		Loger.log(Level.INFO, "lion");
		return a / b;
	}
}
