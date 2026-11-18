package com.ifandelse;

import java.util.Scanner;

public class TestLs3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name;");
		String name= sc.nextLine();
		System.out.println("college name:");
		String collegename = sc.nextLine();
		System.out.println("yearofpassedout:");
		int yearofpassedout = sc. nextInt();
		System.out.println("markes:");
		int markes = sc. nextInt();
		
		if (yearofpassedout>=2025) {
			System.out.println("he is eligible to applay for this job roll");
		}
		
		else if (markes>=80 && yearofpassedout>=2025) {
			System.out.println("your markes is sutabul for this job roll");
		}else {
			System.out.println("your markes is not sutabul then you can leave today");
		}
		
		
		sc.close();
		

	}

}
