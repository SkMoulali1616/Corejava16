package com.intradition;

public class Bankaccount {
	
	static int balance =1000;
	
	void deposit() {
		int a=200;
		int totalamount=balance+a;
		System.out.println(totalamount);
	}
	void withdraw() {
		int b=300;
		int amount=balance-b;
		System.out.println(amount);
	}
	void display() {
		int a=200;
		int totalamount=balance+a;
		int b=300;
		int amount=balance-b;
		int rebalance=(totalamount+amount)-balance;
		System.out.println(rebalance);
	}
	

	public static void main(String[] args) {
		Bankaccount b =new Bankaccount();
		b.deposit() ;
		b.withdraw();
		b.display();

	}

}
