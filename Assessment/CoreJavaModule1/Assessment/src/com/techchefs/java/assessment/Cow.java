package com.techchefs.java.assessment;

import lombok.extern.java.Log;

@Log
public class Cow extends Animal{
	//To print sound of Cow
	@Override
	void displaySound() {
		log.info("Cow makes sound moooo");
	}
}
