package com.techchefs.javaapp.collections;

public class Product implements Comparable<Product>{
	String name;
	int cost;
	double rating;
	/*
	 * @Override public int compareTo(Product o) { if (this.rating < o.rating) {
	 * return -1; } else if (this.rating > o.rating) { return 1; } else { return 0;
	 * } }
	 */
	
	public int compareTo(Product o) {
		Double a = this.rating;
		Double b = o.rating;
		return -(a.compareTo(b));
	}
}
