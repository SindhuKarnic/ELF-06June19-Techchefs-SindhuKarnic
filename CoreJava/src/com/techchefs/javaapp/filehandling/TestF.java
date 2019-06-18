package com.techchefs.javaapp.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestF {
	public static void main(String[] args) {
		
		try {
			FileInputStream fin = new FileInputStream("psd.txt");
			int i;
			while( (i = fin.read()) != -1) {
				System.out.print((char)i);
			}
			//fout.write(ch);
			fin.close();
			//fout.flush();
			//System.out.println("data in file");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		

	}
}
