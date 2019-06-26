package com.techchefs.javaapp.multithreading;

public class Browser extends Thread{
	PVR ref;
	public Browser(PVR ref) {
		this.ref = ref;
	}
	@Override
	public void run() {
		ref.book();
	}
}
