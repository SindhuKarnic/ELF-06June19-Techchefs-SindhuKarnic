package com.techchefs.jdbcapplication.common;

import lombok.extern.java.Log;

@Log
public class ClassA implements MyInterface{
	@Override
	public void printMsg() {
		log.info("aaaaaaa");
	}
}
