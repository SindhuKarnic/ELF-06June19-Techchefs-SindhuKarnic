package com.techchefs.javaapp.lamda;

interface StringLen {
	int leng(String s);
}

public class StringLength {

	public static void main(String[] args) {
		StringLen s = st -> st.length();
		int l = s.leng("sindhu");
		System.out.println(l);
		
	}

}
