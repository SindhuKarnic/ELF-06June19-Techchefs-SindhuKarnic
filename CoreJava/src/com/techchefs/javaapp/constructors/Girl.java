package com.techchefs.javaapp.constructors;

public class Girl {
	void receive(Phone p) {
		if (p instanceof MIPhone) {
			System.out.println("MIPhone");
		} else if (p instanceof Iphone){
			System.out.println("IPhone");
		}
	//	p.call();
	}
}
