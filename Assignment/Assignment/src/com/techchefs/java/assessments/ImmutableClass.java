package com.techchefs.java.assessments;
public final class ImmutableClass {
	final String name;

	public ImmutableClass(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
