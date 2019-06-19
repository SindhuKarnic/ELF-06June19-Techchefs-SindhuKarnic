package com.techchefs.javaapp.collections;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSetgeneric {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("sin");
		hs.add("sind");
		hs.add("d");
		hs.add("sindhu");
		
		for(Object o : hs) {
			System.out.println(o);
		}
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			String ob = it.next();
			System.out.println(ob);
		}
		
	}

}
