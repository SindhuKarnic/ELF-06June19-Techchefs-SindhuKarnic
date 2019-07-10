package com.techchefs.javaapp.collection;

public class Mobile implements Comparable<Mobile> {
	String name;
	double cost;
	String brand;

	void set(String name, double cost, String brand) {
		this.name = name;
		this.cost = cost;
		this.brand = brand;
	}

	@Override
	public int compareTo(Mobile o) {
		Double a = this.cost;
		Double b = o.cost;
		return a.compareTo(b);
	}
}
