package com.techchefs.javaapp.exceptions;
import java.io.IOException;

public class Caller {

	public static void main(String[] args) {
		Parent p = new Parent();
		SecondParent s = new SecondParent();
		try {
			p.display();
			s.show();
			
		} catch(ArithmeticException e) {
			System.out.println("Arithmetic exception");
		} catch(IOException ioe) {
			System.out.println("IO exception");
		} finally {
			System.out.println("end of method");
		}

	}

}
