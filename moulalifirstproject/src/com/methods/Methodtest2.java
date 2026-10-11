package com.methods;

public class Methodtest2 {
     //With Parameters and No Return Value
	
	void multiply( int a,int b) {
		System.out.println(a*b);
	}
	void sumsal(int sal,int bons) {
		System.out.println(sal+bons);
	}
	void sqer(int n) {
		System.out.println(n*n);
	}
	public static void main(String[] args) {
		Methodtest2 h = new Methodtest2();
	 h.multiply(4,5);
	 h.sumsal(30000, 5000);
	 h.sqer(4);

	}

}
