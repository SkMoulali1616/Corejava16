package com.methods;

public class Methodtest3 {
    //No Parameters and With Return Value
	
	int getage() {
		return 23;
	}
	int getmarkes() {
		return 100;
	}
	String getmessage() {
		return "Welcome";
	}
	public static void main(String[] args) {
		
		Methodtest3 p = new Methodtest3();
		p.getage();
		System.out.println(p.getage());
		p.getmarkes();
		System.out.println(p.getmarkes());
		p.getmessage();
		System.out.println(p.getmessage());


	}

}
