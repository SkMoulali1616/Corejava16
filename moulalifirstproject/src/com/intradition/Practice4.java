package com.intradition;

public class Practice4 {
	
	String name;
	int rollno;
	String sub1;
	String sub2;
	String sub3;
	String cource;
	
	int markes1=90;
	int markes2=80;
	int markes3=100;
	
	
	void displayStudentDetails() {
		System.out.println("studentname :"+ name);
		System.out.println("studentRollno:"+ rollno);
		System.out.println("subject:"+sub1);
		System.out.println("subject:"+sub2);
		System.out.println("subject:"+sub3);
		System.out.println("studentcource :"+ cource);
		
	}
	
	void calculateTotal() {
		int total=markes1+markes2+markes3;
		System.out.println("totalmarkes:"+ total);
	}

	void calculateAverage() {
		int total=markes1+markes2+markes3;
		double Average=total/3;
		System.out.println("totalaverage:"+ Average);
	}
	

	public static void main(String[] args) {
		

		Practice4 s = new Practice4();
		s.name="moulali";
		s.rollno=1;
		s.sub1="mathes";
		s.sub2="phy";
		s.sub3="che";
		s.cource ="Bsc";
		
		s.displayStudentDetails();
		s.calculateTotal();
		s.calculateAverage();
	}

}
