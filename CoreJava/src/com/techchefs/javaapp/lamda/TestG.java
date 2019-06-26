package com.techchefs.javaapp.lamda;

import lombok.extern.java.Log;

@Log
public class TestG {
	static void open() {
		log.info("------------open---------");
	}
	
	public static void main(String[] args) {
		Room r = TestG :: open;
		r.remove();
	}

}
