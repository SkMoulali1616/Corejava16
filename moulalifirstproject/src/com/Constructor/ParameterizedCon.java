package com.Constructor;

public class ParameterizedCon {
	
	int age;
	String name;
	double sal;
	
	ParameterizedCon(int i,String s , double d){
		age=i;
		name=s;
		sal=d;
	}
	void display() {
		System.out.println("age:"+age);
		System.out.println("name:"+name);
		System.out.println("sal:"+sal);
	}

	public static void main(String[] args) {
		ParameterizedCon p = new ParameterizedCon(21,"moulali",50000);
		ParameterizedCon p1 = new ParameterizedCon(22,"abc",40000);

		p.display();
		p1.display();

	}

}
