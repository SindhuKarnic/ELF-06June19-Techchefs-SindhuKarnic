package com.techchefs.javaapp.collections;

import java.util.ArrayList;

public class TestArrList {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(2.4);
		al.add('A');
		al.add("sindhu");
		al.add(20);
		al.add('B');
		
		for(Object o : al) {
			System.out.println(o);
		}
	}

}
