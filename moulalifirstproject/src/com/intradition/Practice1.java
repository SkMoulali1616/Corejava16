package com.intradition;

class A{
	B b;
	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("A-class FInalize method called");
	}
}

class B{
	A a;
	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("B-class FInalize method called");
	}
}
public class Practice1 {
	
	
	
	public static void main(String[] args) {
		A objA = new A();
		B objB = new B();
		
		
		objA.b = objB;
		objB.a = objA;
		
		objA = null;
		objB = null;
		System.gc();
		
	}

}
