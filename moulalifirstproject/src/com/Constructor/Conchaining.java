package com.Constructor;

// Constructor Chaining using this()

public class Conchaining {
	
	Conchaining(){
		this(101);
		System.out.println("defaltcon");
		
	}
	Conchaining(int id){
		this(id,"moulali");
		System.out.println(id);
		
	}
	Conchaining(int id,String name){
		System.out.println(name);
	}
	

	public static void main(String[] args) {
		Conchaining c = new Conchaining();
		

	}

}
