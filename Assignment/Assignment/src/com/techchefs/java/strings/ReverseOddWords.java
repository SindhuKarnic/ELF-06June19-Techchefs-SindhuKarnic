package com.techchefs.java.strings;

class ReverseOddWords
{
	static String count(String s)
	{
		int count=1;
		String out="";
		char[] c=s.toCharArray();
		for(int i=0;i<c.length-1;i++)
		{
			String res="";
		
			while(c[i]!=' ' && i<c.length-1)
			{
				res=res+c[i];
				i++;
			}	
			if(c[i]==' ')
			{
				count++;
			}
			if(count%2!=0)
					out=out+" "+res;
				else
					out=res+" "+out;
		}
		return out;
		
	}
	public static void main(String[] args) {
		String s="hoga beda hudugi nana bittu ";
		System.out.println(s);
		String s1=count(s);
		System.out.println(s1);
	}
}