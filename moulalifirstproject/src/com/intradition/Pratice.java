package com.intradition;


public class Pratice {
	
	static int chocolateprice= 15;
	static int cookieprice = 10;
	static int totalmoney = 450;
	
	static int chocolates=10;
	static int cookie=5;
	
	static int totalcostchocolates=chocolateprice*chocolates;
	static int totalcookie=cookieprice*cookie;
	static int totalcost=totalcostchocolates+totalcookie;
	static int rbalance;
	
	static void chocolate(){
		totalcost=totalcostchocolates+totalcookie;
		rbalance=totalmoney-totalcost;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		chocolate();
		System.out.println(rbalance);
		
	}
}
