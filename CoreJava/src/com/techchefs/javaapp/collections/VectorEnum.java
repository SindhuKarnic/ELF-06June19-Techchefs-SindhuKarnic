package com.techchefs.javaapp.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEnum {

	public static void main(String[] args) {
		Vector<Integer> al= new Vector<Integer>();
		al.add(1);
		al.add(10);
		al.add(13);
		al.add(20);
		Enumeration<Integer> e = al.elements();
		while(e.hasMoreElements()) {
			Integer k = e.nextElement();
			System.out.println(k);
		}
	}

}
