package com.techchefs.javaapp.stream;

import java.util.Comparator;
import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class ProductIMPL {

	public static void main(String[] args) {

		Comparator<Product> c = (a, b) -> {
			if (a.id < b.id) {
				return -1;
			} else if (a.id > b.id) {
				return 1;
			} else {
				return 0;
			}
		};
		Product p1 = new Product("diaryMilk", 101, 200.0);
		Product p2 = new Product("Milkybar", 121, 100.0);
		Product p3 = new Product("chocobar", 11, 50.0);
		Product p4 = new Product("mango", 151, 300.0);
		Product p5 = new Product("apple", 31, 500.0);

		TreeSet<Product> tr = new TreeSet<>(c);
		tr.add(p1);
		tr.add(p2);
		tr.add(p3);
		tr.add(p4);
		tr.add(p5);

		for (Product pr : tr) {
			log.info("" + pr);
		}
	}
}
