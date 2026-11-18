package com.ifandelse;

import java.util.Scanner;

public class TestLs8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if (a<=0) {
			System.out.println("invalide age");
			
		}else if(a>=60) {
			System.out.println("old age");
		}else {
			System.out.println("not a old age");
		}

	}

}
