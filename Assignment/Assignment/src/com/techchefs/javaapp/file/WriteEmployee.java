package com.techchefs.javaapp.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteEmployee {

	public static void main(String[] args) {

		FileOutputStream fout=null;
		ObjectOutputStream obj=null;
		try {
			Employee e=new Employee();
			e.set("sindhu", 25, "Dev", 20000);
			fout =new FileOutputStream("person.csv");
			obj=new ObjectOutputStream(fout);
			obj.writeObject(e);	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		finally {

			try {
				if(fout!=null)
					fout.close();
				if(obj!=null)
					obj.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}


}
