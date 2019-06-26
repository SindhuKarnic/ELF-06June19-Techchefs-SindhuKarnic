package com.techchefs.javaapp.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.extern.java.Log;

@Log
public class TestStreamFilters {
	public static void main(String[] args) {
		ArrayList<Integer> al  = new ArrayList<Integer>();
		al.add(3);
		al.add(6);
		al.add(4);
		al.add(9);
		al.add(10);
		
		Stream<Integer> s = al.stream().sorted();
		List<Integer> l = s.collect(Collectors.toList());
		log.info("" +l);
		
		
	}
}
