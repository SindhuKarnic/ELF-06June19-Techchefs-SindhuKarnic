package com.techchefs.javaapp.logger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Register {
	private static final Logger Loger = Logger.getLogger("AmazonLog");
	void connectDb() {
		Loger.log(Level.INFO, "Connected to db");
	}
	void store() {
		Loger.log(Level.INFO, "storing in db");
	}
}
