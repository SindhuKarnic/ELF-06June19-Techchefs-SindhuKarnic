package com.techchefs.java.lamda;


import lombok.extern.java.Log;


interface FactoInterface {
	void facto(int n);
}
@Log

public class TestFacto {

	public static void main(String[] args) {
		FactoInterface fi = a -> {	int fact = 1;
									for(int i = 1; i <= a; i++) {
										fact = fact * i;
									}
									log.info("" +fact);
								 };
		fi.facto(5);					
	}

}
