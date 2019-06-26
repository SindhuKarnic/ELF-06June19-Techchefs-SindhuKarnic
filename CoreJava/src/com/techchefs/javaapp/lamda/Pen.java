package com.techchefs.javaapp.lamda;

import lombok.extern.java.Log;

@Log
public class Pen {
	Pen() {
		log.info("Pen constructor");
	}
	void write() {
		log.info("writing");
	}
}
