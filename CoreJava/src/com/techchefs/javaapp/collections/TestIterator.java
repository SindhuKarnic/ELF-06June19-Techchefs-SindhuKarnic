package com.techchefs.javaapp.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(2.4);
		al.add('A');
		al.add("sindhu");
		al.add(20);
		al.add('B');
		
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
