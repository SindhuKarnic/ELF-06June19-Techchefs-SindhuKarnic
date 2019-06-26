package com.techchefs.javaapp.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import lombok.extern.java.Log;

@Log
public class Testpencil {

	public static void main(String[] args) {
		Pencil p = new Pencil();
		FutureTask<Integer> ft = new FutureTask<Integer>(p);
		Thread t = new Thread(ft);
		t.start();
		try {
			int i = ft.get();
			log.info("" +i);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		
	}

}
