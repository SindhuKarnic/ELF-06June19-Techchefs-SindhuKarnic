package com.techchefs.javaapp.bean;

public class Db1 {
	void receive(Person p) {
		System.out.println("DB1");
		System.out.println("Name "+p.getName());
		System.out.println("Age "+p.getAge());
	}
}
