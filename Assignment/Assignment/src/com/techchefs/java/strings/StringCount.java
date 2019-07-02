package com.techchefs.java.strings;

public class StringCount {

	public static void main(String[] args) {
		String str = "How are you";
		 char ch[]=str.toCharArray();  
		 for (int i = 0; i < ch.length; i ++) {
			 String s = "";
	            while (i < ch.length && ch[i] != ' ') { 
	                s = s + ch[i]; 
	                i++; 
	            }  
	            if (s.length() > 0)  {
	                System.out.print(s + "" + s.length()+ " ");             
	        } 
		 }

	}

}
