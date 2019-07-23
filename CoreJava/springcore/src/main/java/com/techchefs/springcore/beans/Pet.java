package com.techchefs.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Pet {
	String name;
	@Autowired
	//@Qualifier("don")
	private Animal animal;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	public void getAnimalInfo() {
		animal.eat();
		animal.makeSound();
	}
}
