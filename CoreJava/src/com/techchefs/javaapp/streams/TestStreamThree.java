package com.techchefs.javaapp.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class TestStreamThree {

	public static void main(String[] args) {
		ArrayList<Integer> al  = new ArrayList<Integer>();
		al.add(3);
		al.add(6);
		al.add(4);
		al.add(9);
		al.add(10);
		
		Predicate<Integer> p = a -> a % 3 == 0;
		
		List<Integer> l = al.stream().filter(p).collect(Collectors.toList());
		log.info("" +l);
		
		List<Integer> l1 = al.stream().map(a -> a *2).collect(Collectors.toList());
		log.info("" +l1);
	
	}

}
