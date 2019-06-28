package com.techchefs.java.junittest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techchefs.java.junit.SimpleInterest;

/**
 * 
 * @author Sindhu
 *WAP to calculate simple interest, percentage, factorial and write the unit test case.
 */
public class SimpleInterestTest {

	SimpleInterest si = new SimpleInterest();
	@Test
	public void testCalculateSIMethod() {
		double actual = si.calculateSI(2, 3, 100);
		double expected = 6;
		assertEquals(expected, actual, 0.1);
	}

}
