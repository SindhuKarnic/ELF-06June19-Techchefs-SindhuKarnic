package com.techchefs.java.assessment;

import lombok.extern.java.Log;

@Log
public class PrintNumbers extends Thread{
	
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			log.info("" +i);
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
