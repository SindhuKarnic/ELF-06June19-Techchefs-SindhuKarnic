package com.techchefs.java.springs;


import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
import lombok.extern.java.Log;

@Log
@Data
public class Dell implements Laptop{
	
	private String brand="DELL";
	private String color="blue";
	private double cost=8500;
	private double weight=2.5;
	private int  ram=2;
	private String os="window";

	@Autowired
	private StorageDevice storageDevice;
	
	public void display() {
		log.info("color of dell " +color);
	}

	public void process() {
		log.info("ram of dell " +ram);
	}

	public void showSpecification() {
		log.info("Brand : " +brand);
		log.info("Color : " +color);
		log.info("Cost : " +cost);
		log.info("Weight : " +weight);
		log.info("RAM : " +ram);
		log.info("OS : " +os);
		storageDevice.read();
		storageDevice.write(); 
		storageDevice.format();
	}

}
