package com.ifandelse;

import java.util.Scanner;

public class TestLs1 {
   
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("student age");
		int age = sc.nextInt();
		
		if(age>18) {
			System.out.println("he is eligebull for vote");
		}else {
			System.out.println("he is not eligebull for vote");
		}

	}

}
