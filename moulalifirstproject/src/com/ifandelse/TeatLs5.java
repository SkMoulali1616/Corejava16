package com.ifandelse;

import java.util.Scanner;

public class TeatLs5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		char op = sc.next().charAt(0);
		
		if(op== '+') {
			System.out.println(a+b);
		}else if(op=='-') {
			System.out.println(a-b);
		}else if(op=='*') {
			System.out.println(a*b);
		}else if(op=='/') {
			if(b!=0) {
			System.out.println(a/b);
		}else {
			System.out.println("can not devide by zero");
		}
			
		}else {
			System.out.println("invalied opperater");
		}
    sc.close();
	}
}

