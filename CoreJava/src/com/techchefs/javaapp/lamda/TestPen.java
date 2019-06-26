package com.techchefs.javaapp.lamda;

import lombok.extern.java.Log;

@Log
public class TestPen {

	public static void main(String[] args) {
		Penfactory pf = Pen :: new;
		Pen p = pf.getPen();
		p.write();
		
	}

}
