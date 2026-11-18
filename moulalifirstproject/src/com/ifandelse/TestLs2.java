package com.ifandelse;
import java.util.Scanner;

public class TestLs2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("student markes:");
		int markes = sc.nextInt();
		
		if (markes>=90) {
			System.out.println("Grade A");
		}
	else if(markes>=80) {
		System.out.println("Grade B");
	  }
	else if(markes>=70) {
		System.out.println("Grade C");
	  }
	else if(markes>=60) {
		System.out.println("Grade D");
	  }
	else {
		System.out.println("fail");
	}
		sc.close();
	}
}
