package com.techchefs.javaapp.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestE {

	public static void main(String[] args) {
		ArrayList<Double> al= new ArrayList<Double>();
		al.add(2.4);
		al.add(2.5);
		al.add(2.6);
		al.add(2.7);

		Iterator<Double> it = al.iterator();
		while(it.hasNext()) {
			Double d = it.next();
			System.out.println(d);
		}
	}

}
