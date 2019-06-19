package com.techchefs.javaapp.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreesetGeneric {

	public static void main(String[] args) {
		TreeSet<Integer> hs = new TreeSet<Integer>();
		hs.add(10);
		hs.add(9);
		hs.add(6);
		hs.add(20);
		
		for(Object o : hs) {
			System.out.println(o);
		}
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext()) {
			Integer ob = it.next();
			System.out.println(ob);
		}
	}

}
