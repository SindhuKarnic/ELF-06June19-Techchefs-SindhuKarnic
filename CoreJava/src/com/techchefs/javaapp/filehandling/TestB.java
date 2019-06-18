package com.techchefs.javaapp.filehandling;

import java.io.File;
import java.io.IOException;

public class TestB {
	public static void main(String[] args) {
		File f = new File("movies/kannada/new");
		boolean res = f.mkdirs();
		System.out.println(""+res);
		

	}
}
