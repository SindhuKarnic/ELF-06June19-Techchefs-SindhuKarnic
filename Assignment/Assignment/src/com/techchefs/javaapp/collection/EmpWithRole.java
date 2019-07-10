package com.techchefs.javaapp.collection;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class EmpWithRole {
	public static void main(String[] args) {
		ArrayList<Emp> a = new ArrayList<Emp>();
		Emp e1 = new Emp();
		e1.set("John", 25, "Dev", 20000);
		Emp e2 = new Emp();
		e2.set("Amy", 25, "Tester", 25000);
		a.add(e1);
		a.add(e2);
		HashMap<String, ArrayList<Emp>> m = new HashMap<String, ArrayList<Emp>>();
		m.put("first", a);
		for (Map.Entry<String, ArrayList<Emp>> e : m.entrySet()) {
			String key = e.getKey();
			System.out.println(key);
			ArrayList<Emp> ar = e.getValue();
			for (Emp el : ar) {
				el.get();
			}

		}
	}
}