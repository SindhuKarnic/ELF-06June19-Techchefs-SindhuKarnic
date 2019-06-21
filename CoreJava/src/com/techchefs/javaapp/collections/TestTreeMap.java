package com.techchefs.javaapp.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("ggg", 1);
		tm.put("aaa", 7);
		tm.put("uuu", 3);
		tm.put("ccc", 4);
		
		for(Map.Entry<String, Integer> e : tm.entrySet()) {
			String key = e.getKey();
			Integer value = e.getValue();
			System.out.println("key: " +key+ " value: " +value);
		}
		System.out.println("---------keys--------");
		Set<String> ts = tm.keySet();
		for(String s : ts) {
			System.out.println(s);
		}
		System.out.println("---------values-------");
		
		Collection<Integer> c = tm.values();
		Iterator<Integer> it = c.iterator();
		while(it.hasNext()) {
			Integer r = it.next();
			System.out.println(r);
		}
	}

}
