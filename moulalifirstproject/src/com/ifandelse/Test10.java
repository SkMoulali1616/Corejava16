package com.ifandelse;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double amount = sc. nextDouble();
		double discount;
		
		if (amount<0) {
			System.out.println("invalide");
		}else if (amount>=5000) {
			discount= amount * 0.20;
			System.out.println("20% discount valide bill:"+(amount-discount));
		}else if (amount>=2000) {
			discount= amount * 0.10;
			System.out.println("10% discount valide bill:" +(amount-discount) );
		}else {
			System.out.println("no discount valide bill:" + amount);
		}
	
 sc.close();
	}

}
