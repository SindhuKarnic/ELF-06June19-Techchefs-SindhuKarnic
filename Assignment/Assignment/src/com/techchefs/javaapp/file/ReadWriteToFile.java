package com.techchefs.javaapp.file;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class ReadWriteToFile {

private static final Logger log=Logger.getLogger("myLogFile");

	public static void main(String[] args) {
		String msg="Hello";
		char ch[]=msg.toCharArray();
		try {
			FileWriter fout=new FileWriter("myCsvFile.csv",true);
			fout.write(ch);
			fout.flush();
			fout.close();
			log.info("Data in file");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
