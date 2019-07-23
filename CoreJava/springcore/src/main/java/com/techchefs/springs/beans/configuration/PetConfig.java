package com.techchefs.springs.beans.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.techchefs.springcore.beans.Animal;
import com.techchefs.springcore.beans.Donkey;
import com.techchefs.springcore.beans.Monkey;
import com.techchefs.springcore.beans.Pet;

@Configuration
public class PetConfig {
	
	@Bean
	public Pet getPet() {
		return new Pet();
	}
	@Bean(name="mon")
	public Animal getMonkey() {
		return new Monkey();
	}
	@Bean(name="don")
	public Animal getDonkey() {
		return new Donkey();
	}
}
