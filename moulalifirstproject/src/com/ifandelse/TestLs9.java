package com.ifandelse;

import java.util.Scanner;

public class TestLs9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n>=10 && n<=99 || n>=-10 && n<=-99) {
			System.out.println("it is two digites number");
		
		}else {
			System.out.println("not two digites number");
		}

	}

}
