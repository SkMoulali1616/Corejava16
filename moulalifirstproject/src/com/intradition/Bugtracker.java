package com.intradition;

public class Bugtracker {
	
	int bugid;
	String applicationname;
	String bugtitle;
	String severity;
	String priority;
	String status;
	String assignedDeveloper;
	
	int getbugid() {
		return bugid;
	}
	String getapplicationname() {
		return applicationname;
	
	}
	String getbugtitle() {
		return bugtitle;
	}
	String getseverity() {
		return severity;
	}
	String getpriority() {
		return priority;
	}
	String getstatus() {
		return status;
	}
	String getassignedDeveloper() {
		return assignedDeveloper;
	}

	
	public static void main(String[] args) {

		Bugtracker b1=new Bugtracker();
		b1.bugid=1;
		b1.applicationname="emp protal";
		b1.bugtitle="abc";
		b1.severity="critical";
		b1.priority="low";
		b1.status="open";
		b1.assignedDeveloper="moulali";
		
		System.out.println("Bigid;"+ b1.getbugid());
		System.out.println("Applicationname;"+ b1.getapplicationname());
		System.out.println("Bugtitle;"+ b1.getbugtitle());
		System.out.println("Severity;"+ b1.getseverity());
		System.out.println("Priority;"+ b1.getpriority());
		System.out.println("Status;"+ b1.getstatus());
		System.out.println("AssignedDeveloper;"+ b1.getassignedDeveloper());


	}

}
