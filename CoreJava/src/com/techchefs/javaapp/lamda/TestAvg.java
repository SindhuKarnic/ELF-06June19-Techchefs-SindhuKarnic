package com.techchefs.javaapp.lamda;

public class TestAvg {

	public static void main(String[] args) {
		AvgInterface a = new Average() :: calAverage;
		a.avg(21, 16, 19);
	}

}
