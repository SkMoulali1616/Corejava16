package com.Constructor;

//Find the largest of two numbers using a constructor.

public class Teat1con {
	
	int a;
	int b;
	Teat1con(int m,int n){
		a=m;
		b=n;
	}
	void cheak() {
		if(a>b) {
			System.out.println("largest number:" + a);
		}else {
			System.out.println("largest number:" +b);
		}
	}
	

	public static void main(String[] args) {
		Teat1con t = new Teat1con(1,11);
		t.cheak();

	}

}
