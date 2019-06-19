package com.techchefs.javaapp.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Test7 {
	public static void main(String[] args) {
		LinkedList al= new LinkedList();
		al.add(9.2);
		al.add(10);
		al.add('a');
		al.add("sindhu");
		
		for(int i = 0; i < al.size(); i ++) {
			System.out.println("for" +al.get(i));
		}
		for(Object o : al) {
			System.out.println("for each " +o);
		}
		Iterator it = al.iterator();
		System.out.println("iterator");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("list iterator");
		ListIterator li = al.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		
	}
}
