package com.techchefs.javaapp.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestC {

	public static void main(String[] args) {
		String msg = "Hi all good evening";
		byte b[] = msg.getBytes();
		try {
			FileOutputStream fout = new FileOutputStream("myFile.txt");
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
