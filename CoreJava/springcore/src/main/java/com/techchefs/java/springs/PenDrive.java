package com.techchefs.java.springs;

import lombok.Data;
import lombok.extern.java.Log;

@Log
@Data
public class PenDrive implements StorageDevice{
	
	private int capacity;
	private int writingSpeed;
	private int readingSpeed;
	
	public void write() {
		log.info("Writing on pendrive");
	}

	public void read() {
		log.info("Reading from pendrive");
	}

	public void format() {
		log.info("Formatting pendrive");
	}

}
