package com.techchefs.java.strings;
class TestStudent
{
	public static void main(String[] args) {
		Student s[]=new Student[4];
		StudentReceive d=new StudentReceive();
		
		for(int i=0;i<s.length;i++)
		{
			s[i]=new Student();
		}
		s[0].setId(100);
		s[0].setName("Sindhu");
		s[1].setId(101);
		s[1].setName("karnic");
		s[2].setId(102);
		s[2].setName("abc");
		s[3].setId(103);
		s[3].setName("xzy");
		for(int i=0;i<s.length;i++) {
			d.pass(s[i]);
		}

	}
}