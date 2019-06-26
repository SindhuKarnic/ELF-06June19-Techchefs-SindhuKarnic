package com.techchefs.javaapp.logger;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class TestLogger {
	private static final Logger Loger = Logger.getLogger("sindhu");
	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		Loger.setLevel(Level.ALL);
		ConsoleHandler ch = new ConsoleHandler();
		ch.setLevel(Level.ALL);
		Loger.addHandler(ch);
		Loger.log(Level.SEVERE, "Severe");
		Loger.log(Level.FINE, "FINE");
		Loger.log(Level.WARNING, "WARNING");
		Loger.log(Level.INFO, "INFO");
		
		Loger.log(Level.CONFIG, "CONFIG");
		Loger.log(Level.FINER, "FINER");
		Loger.log(Level.FINEST, "FINEST");
	}

}
