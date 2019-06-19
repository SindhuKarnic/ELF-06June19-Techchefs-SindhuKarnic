package com.techchefs.javaapp.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Test10 {
	public static void main(String[] args) {
		Vector<Integer> al= new Vector<Integer>();
		al.add(1);
		al.add(10);
		al.add(13);
		al.add(20);
		
		System.out.println("For");
		for(int i = 0; i < al.size(); i ++) {
			System.out.println(al.get(i));
		}
		System.out.println("For each");
		for(Object o : al) {
			System.out.println(o);
		}
		Iterator<Integer> it = al.iterator();
		System.out.println("iterator");
		while(it.hasNext()) {
			Integer ob = it.next();
			System.out.println(ob);
		}
		System.out.println("list iterator");
		ListIterator<Integer> li = al.listIterator();
		while(li.hasNext()) {
			Integer ob = li.next();
			System.out.println(ob);
		}
		System.out.println();
		while(li.hasPrevious()) {
			Integer ob = li.previous();
			System.out.println(ob);
		}
		
	}
}
