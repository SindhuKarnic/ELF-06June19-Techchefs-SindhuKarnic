package com.techchefs.javaapp.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestF {

	public static void main(String[] args) {
		ArrayList<Double> al= new ArrayList<Double>();
		al.add(2.4);
		al.add(2.5);
		al.add(2.6);
		al.add(2.7);

		ListIterator<Double> it = al.listIterator();
		while(it.hasNext()) {
			Double d = it.next();
			System.out.println(d);
		}
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Sindhu");
		al1.add("SindhuK");
		al1.add("SindhuKar");
		Iterator<String> st1 = al1.iterator();
		while(st1.hasNext()) {
			String d = st1.next();
			System.out.println(d);
		}
		ListIterator<String> st2 = al1.listIterator();
		while(st2.hasNext()) {
			String d = st2.next();
			System.out.println(d);
		}
		
	}

}
