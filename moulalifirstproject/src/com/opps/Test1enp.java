package com.opps;

class employee{
	private int id;
	private String name;
	private double sal;
	
	//setter method 
	
	public void setid(int id) {
		this.id=id;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setsal(double sal) {
		this.sal=sal;
	}
	
	//getter method
	
	public int getid() {
		return id;
	}
	public String getname() {
		return name;
	}
	public double getsal() {
		return sal;
	}
}


public class Test1enp {

	public static void main(String[] args) {
		employee e1=new employee();
		
		e1.setid(1);
		e1.setname("Moulali");
		e1.setsal(3000);
		
		System.out.println(e1.getid());
		System.out.println(e1.getname());
		System.out.println(e1.getsal());
		

	}

}
