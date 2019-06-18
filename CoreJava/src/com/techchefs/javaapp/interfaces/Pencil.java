package com.techchefs.javaapp.interfaces;

public abstract class Pencil {
	void draw() {
		System.out.println("draw using pencil");
	}
	abstract void write();
	abstract void color();
}
