package com.techchefs.javaapp.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestD {
	public static void main(String[] args) {
		String msg = "how i wonder what u r";
		byte b[] = msg.getBytes();
		try {
			FileOutputStream fout = new FileOutputStream("poem.txt", true);
			fout.write(b);
			fout.close();
			System.out.println("data in file");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		

	}
}
