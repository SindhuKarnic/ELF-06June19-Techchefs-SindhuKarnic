package com.techchefs.javaapp.lamda;

import lombok.extern.java.Log;
@Log

public class Average {
	void calAverage(int s1, int s2, int s3) {
		double avg = (s1 + s2 + s3) / 3.0;
		log.info("Avg " +avg);
	}
	
	int calFact(int n) {
		int fact = 1;
		for(int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
