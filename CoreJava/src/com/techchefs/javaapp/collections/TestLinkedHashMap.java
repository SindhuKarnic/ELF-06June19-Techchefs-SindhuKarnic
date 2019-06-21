package com.techchefs.javaapp.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<Character, Double> hm = new LinkedHashMap<Character, Double>();
		hm.put('B', 1.1);
		hm.put('D', 7.1);
		hm.put('A', 3.1);
		hm.put('C', 4.1);
		
		for(Map.Entry<Character, Double> e : hm.entrySet()) {
			Character key = e.getKey();
			Double value = e.getValue();
			System.out.println("key: " +key+ " value: " +value);
			
			
		}
	}

}
