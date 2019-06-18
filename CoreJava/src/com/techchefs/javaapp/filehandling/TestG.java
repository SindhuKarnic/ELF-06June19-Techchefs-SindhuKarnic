package com.techchefs.javaapp.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestG {
public static void main(String[] args) {
		
		try {
			FileReader fin = new FileReader("psd.txt");
			int i;
			while( (i = fin.read()) != -1) {
				System.out.print((char)i);
			}
			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		

	}
}
