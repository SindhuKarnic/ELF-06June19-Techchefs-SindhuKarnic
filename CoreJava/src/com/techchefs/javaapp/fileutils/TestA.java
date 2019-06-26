package com.techchefs.javaapp.fileutils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestA {

	public static void main(String[] args) {
		
		 Person p = new Person(); 
		 p.setName("sindhu"); 
		 p.setId(1);
		 
		FileInputStream fin = null;
		ObjectInputStream objin = null;
		try {
			
			FileOutputStream fout = new FileOutputStream("ObjectFile.txt");
			ObjectOutputStream objOut = new ObjectOutputStream(fout);
			objOut.writeObject(p); objOut.close();

			fin = new FileInputStream("ObjectFile.txt");
			objin = new ObjectInputStream(fin);
			Person p1 = (Person) objin.readObject();
			System.out.println(p1.getId()+ " " +p1.getName());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (objin != null) {
				try {
					objin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		

	}

}
