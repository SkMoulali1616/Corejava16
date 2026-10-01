package com.intradition;

public class MyTest {
	  
	 static int sum(int a, int b) {
		int c= a+b;
		
		return c;
	}
	
	public static void main(String[] args) {
		Integer a=null;
		float s=12.3f;
		double r=123723;
		long d=2868133798l;
		boolean pass=true;
		String g = "moulali";
		System.out.println(a);
//		System.out.println(s);
//		System.out.println(r);
//		System.out.println(d);
//		System.out.println(g);
		System.out.println(sum(2,3));
		
		
//		Integer, Float, dOUBLE, lONG, Boolean - Wrapper classes
		int mahesh = 524;
		Integer moulalInteger = mahesh; //Auto boxing
		int some = moulalInteger; //Un boxing
		
		long ll = Long.valueOf(some);
		System.out.println(some);
		System.out.println(ll);
		
		
	}

}
