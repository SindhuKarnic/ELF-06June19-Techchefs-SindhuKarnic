package com.techchefs.javaapp.inheritance;

public class TestB {

	public static void main(String[] args) {
		LevelThree l = new LevelThree();
		l.displayOne();
		l.displayTwo();
		l.displayThree();
		LevelTwo l2 = new LevelTwo();
		l2.displayOne();
		l2.displayTwo();
		LevelOne l3 = new LevelOne();
		l3.displayOne();

	}

}
