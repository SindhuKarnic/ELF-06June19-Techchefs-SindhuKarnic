package com.techchefs.springs.beans.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techchefs.springcore.beans.Pet;

import lombok.extern.java.Log;

@Log
public class PetTest {

	public static void main(String[] args) {
		ApplicationContext appCon = new AnnotationConfigApplicationContext(PetConfig.class);
		Pet pet = appCon.getBean(Pet.class);
		
		pet.getAnimalInfo();
	}

}
