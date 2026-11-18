package com.ifandelse;

import java.util.Scanner;

public class TestLs7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int a = sc. nextInt();
		
		System.out.println("enter b number:");
		int b = sc.nextInt();
		
		System.out.println("enter a symbel + - * / %:");
		char ch = sc.next().charAt(0);
		{
		switch(ch) {
		case '+' -> System.out.println(a+b);
		case '-' -> System.out.println(a-b);
		case '*' -> System.out.println(a*b);
		case '/' -> System.out.println(a/b);
		case '%' -> System.out.println(a%b);
		default -> System.out.println("invalide number");
		}
		

	}
}
}