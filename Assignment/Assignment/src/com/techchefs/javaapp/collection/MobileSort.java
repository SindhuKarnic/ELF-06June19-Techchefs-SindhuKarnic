package com.techchefs.javaapp.collection;

import java.util.TreeSet;
import java.util.logging.Logger;

/*
 * WAP to sort the mobile object based on the price
 */
public class MobileSort {

private static final Logger log=Logger.getLogger("myLog");

	public static void main(String[] args) {
		TreeSet<Mobile> t = new TreeSet<Mobile>();
		Mobile m1 = new Mobile();
		m1.set("Oppo f3", 20000, "Oppo");
		Mobile m2 = new Mobile();
		m2.set("IPhone", 100000, "apple");
		Mobile m3 = new Mobile();
		m3.set("v9 ", 8000, "vivo");
		Mobile m4 = new Mobile();
		m4.set("MI", 20000, "MI");
		Mobile m5 = new Mobile();
		m5.set("note 5", 20000, "sam");
		t.add(m1);
		t.add(m2);
		t.add(m3);
		t.add(m4);
		t.add(m5);

		for (Mobile p : t) {
			log.info("name=" + p.name + " cost= " + p.cost + " brand=" + p.brand);
		}
	}

}
