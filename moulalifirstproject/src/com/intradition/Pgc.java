package com.intradition;

public class Pgc {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("fugebhu");
	}
	 static void method() {
			Pgc p4 = new Pgc();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pgc p1 = new Pgc();
		Pgc p2 = new Pgc();
		Pgc p3 = new Pgc();
		
		p2=p3;
		
		method();
		
		new Pgc().method();
	
		System.out.println(p1);
		
		p1=null;
		
		System.gc();
		
		

	}

}
