package com.techchefs.javaapp.collections;

import java.util.ArrayList;

public class ArrList {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(2.4);
		al.add('A');
		al.add("sindhu");
		al.add(20);
		al.add('B');
		
		for(int i = 0; i < al.size(); i ++) {
			Object r = al.get(i);
			System.out.println(r);
		}
	}

}
