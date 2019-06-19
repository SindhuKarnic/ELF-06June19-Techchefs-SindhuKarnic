package com.techchefs.javaapp.collections;

import java.util.Iterator;

import java.util.TreeSet;

public class Testtreeset {

	public static void main(String[] args) {
		TreeSet hs = new TreeSet();
		hs.add(10);
		hs.add(11);
		hs.add(2);
		hs.add(12);
		
		for(Object o : hs) {
			System.out.println(o);
		}
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object ob = it.next();
			System.out.println(ob);
		}
	}

}
