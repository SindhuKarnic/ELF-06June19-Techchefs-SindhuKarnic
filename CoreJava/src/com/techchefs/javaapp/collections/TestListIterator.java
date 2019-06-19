package com.techchefs.javaapp.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestListIterator {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(2.4);
		al.add('A');
		al.add("sindhu");
		al.add(20);
		al.add('B');
		
		ListIterator li = al.listIterator(3);
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
