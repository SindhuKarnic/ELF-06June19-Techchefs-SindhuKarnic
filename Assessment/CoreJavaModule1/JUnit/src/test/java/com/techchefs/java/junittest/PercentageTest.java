package com.techchefs.java.junittest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techchefs.java.junit.Percentage;

/**
 * 
 * @author Sindhu
 * WAP to calculate simple interest, percentage, factorial and write the unit test case.
 */
public class PercentageTest {

	private Percentage p = new Percentage();
	
	@Test
	public void testCalculatePercentMethod() {
		double actual = p.calculatePercent(100,100);
		double expected = 100;
		assertEquals(expected, actual, 0.1);
	}
}
