package com.techchefs.javaapp.collections;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashset {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(10.5);
		hs.add('d');
		hs.add("sindhu");
		
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
