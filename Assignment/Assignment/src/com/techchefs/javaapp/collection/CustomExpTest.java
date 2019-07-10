package com.techchefs.javaapp.collection;

import java.util.logging.Logger;

public class CustomExpTest {

private static final Logger log=Logger.getLogger("myLog");

	public static void main(String[] args) {
		ValidNum v = new ValidNum();
		try {
			v.valid(0);
		} catch (NotValidNum e) {

			log.info(" "+e);
		}
	}

}
