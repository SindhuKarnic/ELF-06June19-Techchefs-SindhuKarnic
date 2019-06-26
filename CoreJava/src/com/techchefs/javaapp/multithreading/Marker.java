package com.techchefs.javaapp.multithreading;

import lombok.extern.java.Log;

@Log
public class Marker implements Runnable{
	String name;

	public Marker(String name) {
		this.name = name;
	}


	@Override
	public void run() {
		log.info("Run in marker");
		for(int i = 0; i < 5; i++) {
			log.info(this.name+ "" +i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
