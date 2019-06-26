package com.techchefs.javaapp.logger;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;



public class AmazonLoger {
	private static final Logger Loger = Logger.getLogger("AmazonLog");
	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		Loger.setLevel(Level.ALL);
		
		try {
			FileHandler f = new FileHandler("AmazonLogging.log", true);
			f.setLevel(Level.ALL);
			f.setFormatter(new SimpleFormatter());
			Loger.addHandler(f);
			Register r = new Register();
			r.connectDb();
			r.store();
		} catch (SecurityException | IOException e) {
			System.out.println("IO Exception " +e);
		}

	}

}
