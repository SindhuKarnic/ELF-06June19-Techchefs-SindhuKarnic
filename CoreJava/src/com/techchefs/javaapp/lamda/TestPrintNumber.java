package com.techchefs.javaapp.lamda;

import lombok.extern.java.Log;

interface PrintNumbers {
	void print(int start, int end);
}
@Log
public class TestPrintNumber {

	public static void main(String[] args) {
		PrintNumbers p = (s, e) -> {
			for(int i = s; i <= e; i++) {
				log.info("" + i);
			}
		};
		p.print(5,10);
	}

}
