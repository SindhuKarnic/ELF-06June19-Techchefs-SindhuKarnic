package com.techchefs.javaapp.override;

public class TestB {

	public static void main(String[] args) {
		LevelOne l1 = new LevelOne();
		l1.speed();
		LevelOne l2 = new LevelTwo();
		l2.speed();
		LevelOne l3 =  new LevelThree();
		l3.speed();
		
	}

}
