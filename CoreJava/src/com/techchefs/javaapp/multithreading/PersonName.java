package com.techchefs.javaapp.multithreading;

import lombok.extern.java.Log;

@Log
public class PersonName extends Thread{
	@Override
	public void run() {
		String s = getName();
		log.info(" " +s);
		
	}
}
