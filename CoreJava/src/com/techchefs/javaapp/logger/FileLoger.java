package com.techchefs.javaapp.logger;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FileLoger {
	private static final Logger Loger = Logger.getLogger("flipkart");
	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		Loger.setLevel(Level.ALL);
		
		try {
			FileHandler f = new FileHandler("MyLogData.log", true);
			f.setLevel(Level.ALL);
			f.setFormatter(new SimpleFormatter());
			Loger.addHandler(f);
			Loger.log(Level.SEVERE, "Severe");
			Loger.log(Level.FINE, "FINE");
			Loger.log(Level.WARNING, "WARNING");
			Loger.log(Level.INFO, "INFO");
			Loger.log(Level.CONFIG, "CONFIG");
			Loger.log(Level.FINER, "FINER");
			Loger.log(Level.FINEST, "FINEST");
			
			BuyProduct by = new BuyProduct();
			by.buy();
			System.out.println("done");
		} catch (SecurityException | IOException e) {
			System.out.println("IO Exception " +e);
		}

	}

}
