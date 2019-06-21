package com.techchefs.javaapp.collections;

public class MyArrayList {
	private Object[] myArray;
	private int index;
	public MyArrayList() {
		this(10);
	}
	public MyArrayList(int size) {
		if (size <= 0) {
			throw new ArrayIndexOutOfBoundsException("Size should be greater than zero");
		}
		myArray = new Object[size];
		index = 0;
	}

	public void add(Object ob) {
		if(index >= myArray.length) {
			Object[] myArray2 = new Object[myArray.length*2];
			System.arraycopy(myArray, 0, myArray2, 0, myArray.length);
			myArray = myArray2;
		}
		myArray[index] = ob;
		index++;
	}

	public Object get(int pos) {
		return myArray[pos];
	}
	public void remove(int pos) {
		if (pos > myArray.length-1) {
			throw new ArrayIndexOutOfBoundsException("Position cannot exceed array size");
		}
		System.arraycopy(myArray, pos+1, myArray, pos, myArray.length - 1 - pos);


		/*
		 * for(int i = pos+1; i < myArray.length; i++, pos++) { if (myArray[pos+1] !=
		 * null) { myArray[pos] = myArray[pos+1]; } else { myArray[pos] = null; } }
		 */

	}
	public int getSize() {
		return index-1;
	}
}
