package com.techchefs.javaapp.collections;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Test9 {
	public static void main(String[] args) {
		Vector al= new Vector();
		al.add(9.2);
		al.add(10);
		al.add('a');
		al.add("sindhu");
		
		System.out.println("For");
		for(int i = 0; i < al.size(); i ++) {
			System.out.println(al.get(i));
		}
		System.out.println("For each");
		for(Object o : al) {
			System.out.println(o);
		}
		Iterator it = al.iterator();
		System.out.println("iterator");
		while(it.hasNext()) {
			Object ob = it.next();
			System.out.println(ob);
		}
		System.out.println("list iterator");
		ListIterator li = al.listIterator();
		while(li.hasNext()) {
			Object ob = li.next();
			System.out.println(ob);
		}
		System.out.println();
		while(li.hasPrevious()) {
			Object ob = li.previous();
			System.out.println(ob);
		}
		
	}
}
