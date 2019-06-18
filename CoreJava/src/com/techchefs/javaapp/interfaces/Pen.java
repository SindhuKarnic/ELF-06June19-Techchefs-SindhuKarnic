package com.techchefs.javaapp.interfaces;

public abstract class Pen extends Pencil{
	void write() {
		System.out.println("Writing in pen");
	}
	abstract void color();
}
