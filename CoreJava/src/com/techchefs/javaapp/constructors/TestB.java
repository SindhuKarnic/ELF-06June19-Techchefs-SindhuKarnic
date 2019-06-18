package com.techchefs.javaapp.constructors;
class A{
	int x = 90;
}
class B extends A {
	int x = 60;
	void display() {
		int x = 30;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
}
public class TestB {

	public static void main(String[] args) {
		B b = new B();
		b.display();

	}

}
