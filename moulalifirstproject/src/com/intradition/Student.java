package com.intradition;

public class Student {
	
	static String collegename= "Moulicollege";
	
	int rollno;
	String name;
	int markes;
	
	static {
		System.out.println("collegename:"+ "Moulicollege");
	}
	{
		System.out.println("Student object created");
	
	}
	void Displaystudentdetails() {
		System.out.println("Rollno:"+rollno);
		System.out.println("Nmae:"+ name);
		System.out.println("Markes:"+markes);
	}
	static void Displaycollegedetails() {
		System.out.println("collegeName:"+collegename);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student m = new Student();
		m.rollno=1;
		m.name="Moulali";
		m.markes=100;
		Student a = new Student();
		a.rollno=2;
		a.name="akhil";
		a.markes=100;
	
		m.Displaystudentdetails();
	}

}
