package com.techchefs.java.strings;
class TestProduct
{
	public static void main(String[] args) {
		Product p[]=new Product[4];
		ProductReceive d=new ProductReceive();
		
		for(int i=0;i<p.length;i++)
		{
			p[i]=new Product();
		}
		p[0].setId(100);
		p[0].setName("Abc");
		p[1].setId(101);
		p[1].setName("xyz");
		p[2].setId(102);
		p[2].setName("qwe");
		p[3].setId(103);
		p[3].setName("rty");
		for(int i=0;i<p.length;i++) {
			d.pass(p[i]);
		}

	}
}