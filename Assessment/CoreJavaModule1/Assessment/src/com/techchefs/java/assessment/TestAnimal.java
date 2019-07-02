package com.techchefs.java.assessment;

/**
 * 
 * @author Sindhu Karnic
 * WAP to print sound of an animal based on the object received by the method.
 */
public class TestAnimal {

	public static void main(String[] args) {
		Cow c = new Cow();
		Lion l = new Lion();
		AnimalSound as = new AnimalSound();
		//To print sound of Cow
		as.receive(c);
		//To print sound of lion
		as.receive(l);
	}

}
