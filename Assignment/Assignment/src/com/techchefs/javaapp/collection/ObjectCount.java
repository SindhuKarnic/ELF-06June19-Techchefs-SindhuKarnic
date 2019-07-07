package com.techchefs.javaapp.collection;

import java.util.logging.Logger;

public class ObjectCount {

private static final Logger log=Logger.getLogger("myLog");

	static int count;

	public ObjectCount() {
		count++;

	}

	static void getCount() {
		log.info("number of object created= " + count);
	}

}
