package com.ifandelse;

import java.util.Scanner;

public class TestLs4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a latter:");
		char ch=sc.next().charAt(0);
		
		if(ch>='A' && ch<='Z') {
			System.out.println("Uppercase");
		
	}else if (ch>='a' && ch<='z') {
		System.out.println("lowercase");
			
	}else {
		System.out.println("not a english latter");
		}
		
      sc.close();
	}
	
	}

