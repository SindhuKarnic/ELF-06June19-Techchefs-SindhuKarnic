package com.techchefs.javaapp.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashset {

	public static void main(String[] args) {
		LinkedHashSet hs = new LinkedHashSet();
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
