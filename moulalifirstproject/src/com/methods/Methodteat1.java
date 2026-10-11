package com.methods;

public class Methodteat1 {
	// No Parameters and No Return Value
	void displaycollegename() {
		System.out.println("MRR college");
	}
	void displaydetails() {
		System.out.println("student name: Moulali");
		System.out.println("student age: 23");
		System.out.println("student cource: MCA");
	}
	void displaymarkes() {
		int mathes=100;
		int ns=90;
		int total=mathes+ns;
		System.out.println(total);
	}

	public static void main(String[] args) {
		Methodteat1 s = new Methodteat1();
		s.displaycollegename();
		s.displaydetails();
		s.displaymarkes();

	}

}
