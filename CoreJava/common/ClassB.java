package com.techchefs.jdbcapplication.common;

import lombok.extern.java.Log;

@Log
public class ClassB implements MyInterface {

	@Override
	public void printMsg() {
		log.info("bbbbbbbbb");
	}

}
