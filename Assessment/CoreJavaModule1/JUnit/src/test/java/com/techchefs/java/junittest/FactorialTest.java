package com.techchefs.java.junittest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techchefs.java.junit.Factorial;

/**
 * 
 * @author Sindhu
 * WAP to calculate simple interest, percentage, factorial and write the unit test case.
 */
public class FactorialTest {
	
	Factorial f = new Factorial();
	
	@Test
	public void testCalculateFactMethod() {
		int actual = f.calculateFact(5);
		int expected = 120;
		assertEquals(expected, actual);
	}

}
