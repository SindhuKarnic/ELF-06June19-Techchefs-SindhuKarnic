package com.techchefs.javaapp.implementinglamda;

import lombok.extern.java.Log;

@Log
public class Testgender {

	public static void main(String[] args) {
		log.info("" +Gender.MALE.ordinal());
		Gender t = Gender.FEMALE;
		switch(t) {
		case MALE : log.info("Male");
		break;
		case FEMALE : log.info("FEMALE");
		break;
		case OTHER : log.info("OTHER");
		break;
		}
		
	}

}
