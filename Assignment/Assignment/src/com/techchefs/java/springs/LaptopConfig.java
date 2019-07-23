package com.techchefs.java.springs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LaptopConfig {
	@Bean
	public Laptop getLaptop() {
		return new Dell();
	}
	@Bean
	public StorageDevice getStorageDevice() {
		return new HardDisk();                                                                                                                                              
	}
}
