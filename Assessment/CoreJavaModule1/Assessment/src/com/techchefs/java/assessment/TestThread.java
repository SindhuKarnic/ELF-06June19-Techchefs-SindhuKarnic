package com.techchefs.java.assessment;



/**
 * 
 * @author Sindhu 
 * WAP to print the numbers from 1 to 10 using 5 threads, with
 *         the thread pool size of 2.
 */
public class TestThread {

	public static void main(String[] args) {
		PrintNumbers pr = new PrintNumbers();
		Thread th1 = new Thread(pr);
		th1.start();
		Thread th2 = new Thread(pr);
		th2.start();
		Thread th3 = new Thread(pr);
		th3.start();
		Thread th4 = new Thread(pr);
		th4.start();
		Thread th5 = new Thread(pr);
		th5.start();
	}

}
