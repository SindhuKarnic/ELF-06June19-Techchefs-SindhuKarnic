package com.techchefs.javaapp.fileutils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class TestC {

	public static void main(String[] args) {
		String fileData;
		try {
			fileData = FileUtils.readFileToString(new File("D:\\MytextFile.txt"), Charset.defaultCharset());
			System.out.println(fileData);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
