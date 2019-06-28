package com.techchefs.java.assessment;

import lombok.extern.java.Log;

@Log
public class Lion extends Animal{
	//To print sound of lion
	@Override
	void displaySound() {
		log.info("Lion makes sound rrrr");
	}
}
