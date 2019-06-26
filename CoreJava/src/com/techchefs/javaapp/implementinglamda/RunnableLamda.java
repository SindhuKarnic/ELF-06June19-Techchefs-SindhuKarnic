package com.techchefs.javaapp.implementinglamda;

import lombok.extern.java.Log;

@Log
public class RunnableLamda {
	public static void main(String[] args) {
		Runnable x = () -> {
			log.info("Run in marker");
			for(int i = 0; i < 5; i++) {
				log.info("" +i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread th = new Thread(x);
		th.start();
		
	}
	
}
