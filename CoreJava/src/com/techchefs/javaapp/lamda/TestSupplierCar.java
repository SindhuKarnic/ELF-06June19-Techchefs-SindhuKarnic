package com.techchefs.javaapp.lamda;

import java.util.function.Supplier;

import lombok.extern.java.Log;

@Log
public class TestSupplierCar {

	public static void main(String[] args) {
		Supplier<Car> s = () -> new Car(16.5);
		Car c = s.get();
		log.info("" +c.fuelCapacity);
	}

}
