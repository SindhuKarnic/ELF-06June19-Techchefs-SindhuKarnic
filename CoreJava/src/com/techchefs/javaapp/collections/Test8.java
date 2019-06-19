package com.techchefs.javaapp.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Test8 {
	public static void main(String[] args) {
		LinkedList<Character> al= new LinkedList<Character>();
		al.add('a');
		al.add('b');
		al.add('c');
		al.add('d');
		
		for(int i = 0; i < al.size(); i ++) {
			Character ch = al.get(i);
			System.out.println("for" +ch);
		}
		for(Object o : al) {
			System.out.println("for each " +o);
		}
		Iterator<Character> it = al.iterator();
		System.out.println("iterator");
		while(it.hasNext()) {
			Character ch = it.next();
			System.out.println(ch);
		}
		System.out.println("list iterator");
		ListIterator<Character> li = al.listIterator();
		while(li.hasNext()) {
			Character ch = li.next();
			System.out.println(ch);
		}
		while(li.hasPrevious()) {
			Character ch = li.previous();
			System.out.println(ch);
		}
	}
}
