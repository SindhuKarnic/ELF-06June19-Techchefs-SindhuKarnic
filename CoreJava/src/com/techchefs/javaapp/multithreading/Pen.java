package com.techchefs.javaapp.multithreading;

import lombok.extern.java.Log;

@Log
public class Pen extends Thread{
	@Override
	public void run() {
		for(int i =0; i < 5; i++) {
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			log.info(" " +i);
		}
	}
}
