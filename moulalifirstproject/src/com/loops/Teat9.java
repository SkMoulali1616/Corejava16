package com.loops;

import java.util.Scanner;

public class Teat9 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter a number:");
		int n = sc.nextInt();
		
		int squre =n*n;
		int temp=n;
		int rem;
		
		boolean flag =true;
		while (temp>0) {
			rem=temp%10;
			if(rem!=squre %10) {
				flag=false;
				break;
			}
			temp=temp/10;
			squre=squre/10;
			}
		if (flag) {
			System.out.println("autophormic number");
		}else {
			System.out.println("not a autophormic number ");
		}
		sc.close();
	}

}
