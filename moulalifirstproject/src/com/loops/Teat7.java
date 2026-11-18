package com.loops;

import java.util.Scanner;

public class Teat7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Base number:");
		int b = sc.nextInt();
		System.out.println("Enter a power number:");
		int p = sc.nextInt();
		
		int result=1;
		
		for(int i=1; i<=p; i++) {
			result = result*b;
		}
         System.out.println("result:" + result);
         sc.close();
	}

}
