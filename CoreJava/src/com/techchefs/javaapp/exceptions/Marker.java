package com.techchefs.javaapp.exceptions;

public class Marker {
	private final static Marker m = new Marker();
	private Marker() {
		
	}
	public static Marker getMarker() {
		return m;
	}
}
