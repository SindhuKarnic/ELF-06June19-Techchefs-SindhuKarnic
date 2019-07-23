package com.techchefs.springs.beans.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techchefs.springcore.beans.Pet;

public class NewPetTest {

	public static void main(String[] args) {
		ApplicationContext appCon = new ClassPathXmlApplicationContext("PetConfig.xml");
		Pet pet = (Pet) appCon.getBean("pet");
		
		pet.getAnimalInfo();
	}

}
