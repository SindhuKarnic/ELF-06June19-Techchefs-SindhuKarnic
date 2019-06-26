package com.techchefs.javaapp.logger;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestA {
	private static final Logger Loger = Logger.getLogger("Animal");
	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		Loger.setLevel(Level.ALL);
		
		try {
			FileHandler f = new FileHandler("AnimalLog.log", true);
			f.setLevel(Level.ALL);
			f.setFormatter(new SimpleFormatter());
			Loger.addHandler(f);
			Loger.log(Level.SEVERE, "Severe");
			Animal a = new Cow();
			a.sound();
			a.division(10, 2);
			Animal b = new Lion();
			b.sound();
			b.division(12, 2);
			Animal c = new Animal();
			c.sound();
			c.division(12, 2);
			System.out.println("done");
		} catch (SecurityException | IOException e) {
			System.out.println("IO Exception " +e);
		}

		
	}

}
