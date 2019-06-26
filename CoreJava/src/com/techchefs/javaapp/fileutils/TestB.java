package com.techchefs.javaapp.fileutils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class TestB {

	
	public static void main(String[] args) {
		try {
			//FileUtils.writeStringToFile(new File("MytextFile.txt"), "hello");
			FileUtils.writeStringToFile(new File("D:\\MytextFile.txt"), "hello", Charset.defaultCharset());
			System.out.println("created");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
