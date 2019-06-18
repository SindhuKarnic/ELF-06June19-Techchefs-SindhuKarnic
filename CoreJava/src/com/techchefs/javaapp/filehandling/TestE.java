package com.techchefs.javaapp.filehandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class TestE {
	public static void main(String[] args) {
		String msg = "how i wonder what u r";
		char ch[] = msg.toCharArray();
		try {
			FileWriter fout = new FileWriter("psd.txt");
			fout.write(ch);
			//fout.close();
			fout.flush();
			System.out.println("data in file");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		

	}
}
