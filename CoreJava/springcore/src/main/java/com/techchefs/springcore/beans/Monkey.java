package com.techchefs.springcore.beans;

import lombok.extern.java.Log;

@Log
public class Monkey implements Animal{

	public void eat() {
		log.info("Monkey eats");
	}

	public void makeSound() {
		log.info("Monkey sound");
	}

}
