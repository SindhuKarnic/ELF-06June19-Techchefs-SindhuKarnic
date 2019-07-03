package com.techchefs.java.objects;

public class SearchEmployee {
	void search(int id) {
		System.out.println("Searched by id "+id);
	}
	void search(String name) {
		System.out.println("Searched by name "+name);
	}
	public static void main(String[] args) {
	SearchEmployee s = new SearchEmployee();
	s.search(20);
	s.search("name");

	}

}
