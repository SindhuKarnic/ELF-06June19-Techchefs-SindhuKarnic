package com.techchefs.javaapp.override;

public class TestC {

	public static void main(String[] args) {
//		Animal a = new Animal();
//		a.eat();
//		Animal a2 = new Lion();
//		a2.eat();
//		Animal a3 = new Cow();
//		a3.eat();
		
//		Pen1 p = new Pen1();
//		Writer w = new Writer();
//		w.receive(p);
		
//		Bottle b = new Bottle();
//		Drinker d = new Drinker();
//		d.receiveBottle(b);
		
		
		Baby b = new Baby();
		Lays l = new Lays();
		b.receive(l);
		Kurkure k = new Kurkure();
		b.receive(k);
		

	}

}
