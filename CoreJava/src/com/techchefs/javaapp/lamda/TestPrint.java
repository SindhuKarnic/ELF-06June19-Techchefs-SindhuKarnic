package com.techchefs.javaapp.lamda;

import lombok.extern.java.Log;


interface PrintMessage {
	void print(String msg);
}
@Log
public class TestPrint {

	public static void main(String[] args) {
		PrintMessage p = msg -> log.info(msg);
		p.print("Lamda Expression");
	}

}
