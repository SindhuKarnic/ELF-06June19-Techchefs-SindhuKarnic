package com.techchefs.javaapp.collections;

import java.util.TreeSet;

public class TestProducttreeset {

	public static void main(String[] args) {
		TreeSet<Product> ts = new TreeSet<Product>();
		Product p1 = new Product();
		p1.name = "abc";
		p1.cost = 10;
		p1.rating  = 5.1;
		Product p2 = new Product();
		p2.name = "yx";
		p2.cost = 17;
		p2.rating  = 2.4;
		Product p3 = new Product();
		p3.name = "gh";
		p3.cost = 7;
		p3.rating  = 3.1;
		Product p4 = new Product();
		p4.name = "tt";
		p4.cost = 15;
		p4.rating  = 9.1;
		
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		
		for(Product p : ts) {
			System.out.println("Name: " +p.name+ " cost: " +p.cost+ " rating: " +p.rating);
		}
		
	}

}
