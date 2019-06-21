package com.techchefs.javaapp.collections;

import lombok.extern.java.Log;

@Log
public class MyArrayListTest {

	public static void main(String[] args) {
		MyArrayList a = new MyArrayList();
		long startTime = System.currentTimeMillis();
		int size = 12;
		for(int i = 0; i < size; i++) {
			a.add(10);
		}
		for(int i = 0; i < size; i++) {
			log.info("Returned object " +a.get(i));
		}
		  log.info("Removing object"); 
		  a.remove(1); 
		  long endTime = System.currentTimeMillis(); 
		  log.info("Time "+(endTime - startTime)); 
		  for(int i = 0; i < size; i++) { 
			  log.info("Returned object " +a.get(i)); 
		  }
		 
		
	}

}
