package com.techchefs.javaapp.bean;

public class TestA {
	public static void main(String[] args) {
		College.s.name = "Name";
		System.out.println(College.s.name);
		College.s.play();
		College c = new College();
		c.teach();
		System.out.println();
		
	}
}
