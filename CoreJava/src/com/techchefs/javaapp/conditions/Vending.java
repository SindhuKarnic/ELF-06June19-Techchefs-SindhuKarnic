package com.techchefs.javaapp.conditions;

public class Vending {
	public static void main(String[] args) {
		int option = 30;
		String msg;
		switch (option) {
		case 10: msg = "Lays";
		break;
		case 20: msg = "Kurkure";
		break;
		case 30: msg ="Dairy Milk";
		break;
		default : msg = "Invalid";
		}
		System.out.println(msg);
	}
}
