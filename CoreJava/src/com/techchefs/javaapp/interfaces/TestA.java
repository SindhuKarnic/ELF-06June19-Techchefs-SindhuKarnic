package com.techchefs.javaapp.interfaces;

public class TestA {

	public static void main(String[] args) {
		/*
		 * Honda h = new Hero(); h.engine(); h.design();
		 */
		/*
		 * Pencil p = new Marker(); p.draw(); p.write(); p.color();
		 */
		/*
		 * Printer p = new Sony(); p.print();
		 */
		/*
		 * Person p = new Person(); p.eat(); p.walk();
		 */
		
		/*
		 * Browser b = new Browser(); Google g = new Gmail(); b.open(g); Google g1 = new
		 * GDrive(); b.open(g1);
		 */
		
		Machine m = new Machine();
		ICICI i = new ICICI();
		m.insertCard(i);
		HDFC h = new HDFC();
		m.insertCard(h);
		SBI s = new SBI();
		m.insertCard(s);
	}

}
