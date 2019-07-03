package com.techchefs.java.objects;

public class TestA {

	public static void main(String[] args) {
		Icecream i = new Icecream();
		Baby b = new Baby();
		b.receive(i);
		Gift g = new Gift();
		Friend f = new Friend();
		f.receive(g);
		Bens be = new Bens();
		Driver d = new Driver();
		d.receive(be);
		Audi a = new Audi();
		d.receive(a);
		Fuel ff = new Fuel();
		Car c = new Car();
		c.drive();
		Cars cc = new Cars();
		cc.receiveFuel(ff);
		Gun gun = new Gun();
		Bullet bull = new Bullet();
		gun.receiveBullet(bull);
	}

}
