package com.techchefs.javaapp.multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestMarker {

	public static void main(String[] args) {
		/*
		 * Marker m = new Marker(); Thread t = new Thread(m); t.start(); Thread t2 = new
		 * Thread(m); t2.start();
		 */
		Marker m1 = new Marker("A");
		Marker m2 = new Marker("B");
		Marker m3 = new Marker("C");
		Marker m4 = new Marker("D");
		Marker m5 = new Marker("E");
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(m1);
		es.execute(m2);
		es.execute(m3);
		es.execute(m4);
		es.execute(m5);
		
		es.shutdown();
	}

}
