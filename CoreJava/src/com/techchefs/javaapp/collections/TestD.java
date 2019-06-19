package com.techchefs.javaapp.collections;

import java.util.ArrayList;

public class TestD {

	public static void main(String[] args) {
		ArrayList<Double> al= new ArrayList<Double>();
		al.add(2.4);
		al.add(2.5);
		al.add(2.6);
		al.add(2.7);
		for(int i = 0; i < al.size(); i ++) {
			Double d = al.get(i);
			System.out.println(d);
		}
	}

}
