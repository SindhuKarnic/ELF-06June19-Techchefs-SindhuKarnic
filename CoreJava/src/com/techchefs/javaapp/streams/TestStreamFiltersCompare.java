package com.techchefs.javaapp.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.extern.java.Log;

@Log
public class TestStreamFiltersCompare {
	public static void main(String[] args) {
		ArrayList<Integer> al  = new ArrayList<Integer>();
		al.add(3);
		al.add(6);
		al.add(4);
		al.add(9);
		al.add(10);
		
		
		Comparator<Integer> c = (i,j) -> i.compareTo(j) * -1; 
		List<Integer> l = al.stream().sorted(c).collect(Collectors.toList());
		log.info("" +l);
		al.stream().forEach(i -> log.info("" +i));
		
		
	}
}
