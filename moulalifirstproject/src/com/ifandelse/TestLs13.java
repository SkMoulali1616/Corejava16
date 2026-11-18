package com.ifandelse;

import java.util.Scanner;

public class TestLs13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a connection type:");
		String connectiontype= sc.nextLine();
		
		System.out.println("enter number of unites:");
		int unites = sc.nextInt();
		
		int rate=0;
		int bill=0;
		 switch(connectiontype) {
		 case "domostic":
			 if (unites<=100) {
				 rate = 2;
			 }else if (unites<=200) {
				 rate=3;
			 }else {
				 rate=4;
			 }
			 bill=unites*rate;
			 break;
		 }
			System.out.println("enter unites:" + unites);
			System.out.println("enter total bill:" + bill);
	}

}
