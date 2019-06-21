package com.techchefs.javaapp.collections;

public class Student implements Comparable<Student>{
	String name;
	int id;
	int percent;
	@Override
	public int compareTo(Student o) {
		
		  String a = this.name; 
		  String b = o.name; 
		  int i = a.compareTo(b); 
		  return i;
		 
			//return this.name.compareTo(o.name);
	}
	/* Logic to sort wrt id
	 * @Override public int compareTo(Student o) { if (this.id < o.id) { return -1;
	 * } else if (this.id > o.id) { return 1; } else { return 0; } }
	 */
	
	/* Logic to sort Student wrt percent
	 * public int compareTo(Student o) {
		if (this.percent < o.percent) {
			return -1;
		} else if (this.percent > o.percent) {
			return 1;
		} else {
			return 0;
		}
	}*/
	
	

}
