package com.techchefs.javaapp.filehandling;

import java.io.File;
import java.io.IOException;

public class TestA {

	public static void main(String[] args) {
		File f = new File("M:/sindhu.txt");
		try {
			boolean res = f.createNewFile();
			System.out.println(res);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
