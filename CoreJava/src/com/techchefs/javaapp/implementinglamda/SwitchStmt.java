package com.techchefs.javaapp.implementinglamda;

import lombok.extern.java.Log;

@Log
public class SwitchStmt {
	public static void main(String[] args) {
		String s ="Apple";
		switch(s) {
		case "Apple" : log.info("Apple");
		break;
		case "Cat" : log.info("cat");
		break;
		default : log.info("default");
		}
	}
}
