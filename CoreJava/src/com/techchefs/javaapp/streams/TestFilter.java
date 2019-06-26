package com.techchefs.javaapp.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class TestFilter {
	public static void main(String[] args) {
		ArrayList<Integer> al  = new ArrayList<Integer>();
		al.add(3);
		al.add(6);
		al.add(4);
		al.add(9);
		al.add(10);
		
		Predicate<Integer> p = a -> a % 2 != 0;
		
		List<Integer> l = al.stream().filter(p).collect(Collectors.toList());
		log.info("" +l);
		
		long c = al.stream().filter(p).count();
		log.info("" +c);
	}
}
