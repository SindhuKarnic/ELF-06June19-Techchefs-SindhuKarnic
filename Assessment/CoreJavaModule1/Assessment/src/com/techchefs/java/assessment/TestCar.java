package com.techchefs.java.assessment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

/**
 * 
 * @author Sindhu
 *
 * WAP to display only the cars that belongs to respective brand. (Using Lambda and Stream)
 */
@Log
public class TestCar {

	public static void main(String[] args) {
		//To test brand is taken as 'hyundai'
		Car c1 = new Car("KA000000", "Tata", "indica");
		Car c2 = new Car("KA000001", "hyundai", "i10");
		Car c3 = new Car("KA000002", "hyundai", "120");
		Car c4 = new Car("KA000003", "maruthi", "zen");
		
		ArrayList<Car> al = new ArrayList<Car>();
		
		al.add(c1);
		al.add(c2);
		al.add(c3);
		al.add(c4);
		
		List<Car> st = al.stream().filter(s -> s.getBrand() == "hyundai").collect(Collectors.toList());
		
		for (Car car : st) {
			log.info("Car name: " +car.getName()+ " Car brand: " +car.getBrand());
		}
	}

}
