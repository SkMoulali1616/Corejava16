package com.Constructor;


public class Conretangle {
	
	int length;
	int bearth;
	 
	Conretangle(int l,int b){
		length=l;
		bearth=b;
	}
	void area() {
		System.out.println("Area:" + (length*bearth));
	}

	public static void main(String[] args) {
		Conretangle c1=new Conretangle(10,5);
		c1.area();

	}

}
