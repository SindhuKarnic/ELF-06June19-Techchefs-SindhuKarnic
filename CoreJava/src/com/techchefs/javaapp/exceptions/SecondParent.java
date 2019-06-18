package com.techchefs.javaapp.exceptions;
import java.io.File;
import java.io.IOException;

public class SecondParent {
	void show() throws IOException{
		File f = new File("M:\\");
		f.createNewFile();
		System.out.println("File creation successful");
	}
}
