package com.techchefs.java.springs;

import lombok.Data;
import lombok.extern.java.Log;

@Log
@Data
public class HardDisk implements StorageDevice{
	private int capacity;
	private int writingSpeed;
	private int readingSpeed;
	
	public void write() {
		log.info("Writing on HardDisk");
	}

	public void read() {
		log.info("Reading from HardDisk");
	}

	public void format() {
		log.info("Formatting HardDisk");
	}

}
