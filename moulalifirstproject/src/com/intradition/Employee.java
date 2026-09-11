package com.intradition;

public class Employee {
	
	static String companyname;
	static {
		companyname="abc";
		System.out.println(companyname);
	}
	
	
	int empid ;
	String empname;
	int salary;
	
	{
		System.out.println("Welcome to abc");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.empid = 1;
		e1.empname = "moulali";
		e1.salary = 8000;
		
		
				

	}

}
