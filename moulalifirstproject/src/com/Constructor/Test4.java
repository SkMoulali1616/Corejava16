package com.Constructor;

public class Test4 {
	Test4(){
		this(123);
	}
	Test4(int id){
		this(id,"moulali");
		System.out.println(id);
	}
	Test4(int id,String name){
		
		System.out.println(name);
	}

	public static void main(String[] args) {
		Test4 h = new Test4();
	}

}
