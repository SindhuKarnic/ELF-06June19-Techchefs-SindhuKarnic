package com.techchefs.javaapp.exceptions;

public class TestB {

	public static void main(String[] args) {
		/*
		 * Animal a = new Cow(); Cow c = (Cow) a; c.i = 10; c.j = 20; c.eat(); c.run();
		 */
		/*
		 * Pen p = new Mark(); Mark m = (Mark) p; m.cost = 10; m.write(); m.size = 12.3;
		 * m.color();
		 */
		/*
		 * Bus b = new Van(); Van v = (Van) b; v.modal = 10; v.seats = 20; v.move();
		 * v.turn();
		 */
		Chips c1 = new Lays();
		Lays l = (Lays) c1;
		l.eat();
		l.open();
		Chips c2 = new Bingo();
		Bingo b = (Bingo) c2;
		b.eatBingo();
		b.open();
	}

}
