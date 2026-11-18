package com.opps;
//Real-time situation: An employee's salary should not be negative.

//We can use a setter with a condition to validate the salary.


class emp{
	private int sal;
	//setter method
	public void setsal(int sal) {
		if(sal>0) {
			this.sal=sal;
		}else {
			System.out.println("invalid salary");
		}
	}
	public int getsal() {
		return sal;
	}
}

public class Test2enp {

	public static void main(String[] args) {
		emp e = new emp();
		e.setsal(4000);
		System.out.println(e.getsal());
		

	}

}
