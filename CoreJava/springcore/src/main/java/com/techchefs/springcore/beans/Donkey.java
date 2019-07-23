package com.techchefs.springcore.beans;

import lombok.extern.java.Log;

@Log
public class Donkey implements Animal{

	public void eat() {
		log.info("Donkey eats");
	}

	public void makeSound() {
		log.info("Donkey sound");
	}
	
}
