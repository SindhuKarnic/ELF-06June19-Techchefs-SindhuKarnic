package com.techchefs.javaapp.logger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BuyProduct {
	private static final Logger Loger = Logger.getLogger("flipkart");
	void buy() {
		Loger.log(Level.SEVERE, "Severe");
		Loger.log(Level.FINE, "FINE");
		Loger.log(Level.WARNING, "WARNING");
		Loger.log(Level.INFO, "INFO");
		Loger.log(Level.CONFIG, "CONFIG");
		Loger.log(Level.FINER, "FINER");
		Loger.log(Level.FINEST, "FINEST");
	}
}
