package com.techchefs.java.assessment;

public class Car {
	private String carNo;
	private String brand;
	private String name;
	
	public Car(String carNo, String brand, String name) {
		this.carNo = carNo;
		this.brand = brand;
		this.name = name;
	}
	public String getCarNo() {
		return carNo;
	}
	public String getBrand() {
		return brand;
	}
	public String getName() {
		return name;
	}
	
}
