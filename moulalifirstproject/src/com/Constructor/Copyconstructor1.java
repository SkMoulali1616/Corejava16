package com.Constructor;

public class Copyconstructor1 {
	
	int id;
	String name;
	
	Copyconstructor1(int i,String s){
		id=i;
		name=s;
	}
	Copyconstructor1(Copyconstructor1 c ){
		id=c.id;
		name=c.name;
	}
	
	void display() {
		System.out.println(id);
		System.out.println(name);

	}
	public static void main(String[] args) {
		Copyconstructor1 c1 = new Copyconstructor1(23,"moulali");
		Copyconstructor1 c2=new Copyconstructor1(c1);
		Copyconstructor1 c3=new Copyconstructor1(c2);
		c1.display();
		c2.display();
		c3.display();

	}

}
