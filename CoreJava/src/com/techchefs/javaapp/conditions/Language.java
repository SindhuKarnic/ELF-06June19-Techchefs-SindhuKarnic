package com.techchefs.javaapp.conditions;

public class Language {
public static void main(String[] args) {
	int langOption = 3;
	String msg;
	switch (langOption) {
	case 1: msg = "Kannade";
	break;
	case 2: msg = "English";
	break;
	case 3: msg ="Telugu";
	break;
	default : msg = "Invalid";
	}
	System.out.println(msg);
}
}
