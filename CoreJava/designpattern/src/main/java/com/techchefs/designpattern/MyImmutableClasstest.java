package com.techchefs.designpattern;

import lombok.extern.java.Log;

@Log
public class MyImmutableClasstest { 
	
	public static void main(String[] args) {
		MyImmutableClass immutableClass = null;
		immutableClass = new MyImmutableClass("abc", 11, 11111111111L);
		log.info("Name " +immutableClass.getName());
		log.info("Age " +immutableClass.getAge());
		log.info("Phone " +immutableClass.getPhone());
		
		immutableClass = new MyImmutableClass("xyz", 11, 11111111111L);
		log.info("Name " +immutableClass.getName());
		log.info("Age " +immutableClass.getAge());
		log.info("Phone " +immutableClass.getPhone());
		
	}
}
