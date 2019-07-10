package com.techchefs.javaapp.collection;

import java.util.ArrayList;
import java.util.logging.Logger;

public class FiveStudentTest {

private static final Logger log=Logger.getLogger("myLog");

	public static void main(String[] args) {
		ArrayList<FiveStudent> a = new ArrayList<FiveStudent>();
		FiveStudent p1 = new FiveStudent();
		p1.setName("sarah");
		p1.setId(101);
		p1.setMarks(70);
		FiveStudent p4 = new FiveStudent();
		p4.setName("john");
		p4.setId(102);
		p4.setMarks(70);
		FiveStudent p2 = new FiveStudent();
		p2.setName("tom");
		p2.setId(103);
		p2.setMarks(80);
		FiveStudent p3 = new FiveStudent();
		p3.setName("anna");
		p3.setId(104);
		p3.setMarks(60);

		a.add(p1);
		a.add(p2);
		a.add(p3);
		for (FiveStudent p : a) {
			log.info("name=" + p.getName() + " ID=" + p.getId() + " marks=" + p.getMarks());
		}

	}
}
