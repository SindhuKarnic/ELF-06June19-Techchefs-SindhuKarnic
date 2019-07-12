package com.techchefs.java.assessments;
/**
 * WAP to create a custom exception to validate the temperature of the server room. 
 * */
public class TempCustomExceptionTest {

	public static void main(String[] args) {
		double temp=25.00;
		TempCustomException c =new TempCustomException();
		c.validateServerRoomTemp(temp);
	}

}
