package com.techchefs.javaapp.collections;

import java.util.TreeSet;

public class TestTreeSetCar {

	public static void main(String[] args) {
		TreeSet<Car> ts = new TreeSet<Car>();
		Car c1 = new Car();
		c1.name = "Abc";
		c1.brand = "Audi";
		c1.cost = 20000;
		c1.rating = 5.1;
		
		Car c2 = new Car();
		c2.name = "XYZ";
		c2.brand = "Benz";
		c2.cost = 50000;
		c2.rating = 6.1;
		
		Car c3 = new Car();
		c3.name = "Tuv";
		c3.brand = "Audi";
		c3.cost = 40000;
		c3.rating = 2.1;
		
		Car c4 = new Car();
		c4.name = "Aaa";
		c4.brand = "Audi";
		c4.cost = 70000;
		c4.rating = 1.1;
		
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		
		for(Car c : ts) {
			System.out.println("Name: " +c.name+ " brand: " +c.brand+ " cost: " +c.cost+ " rating: " +c.rating);
		}
		
	}

}
