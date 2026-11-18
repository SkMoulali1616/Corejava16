package com.Constructor;

public class Noargcon {
	
	
	int age;
	String name;
	
	Noargcon(){
		age=24;
		name="Moulali";
	}
	void display() {
		System.out.println("age:"+ age);
		System.out.println("name:"+ name);
	}

	public static void main(String[] args) {
		Noargcon n = new Noargcon();
		
		n.display();
		

	}

}
