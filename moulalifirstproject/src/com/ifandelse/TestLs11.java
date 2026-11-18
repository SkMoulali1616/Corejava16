package com.ifandelse;

import java.util.Scanner;

public class TestLs11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your order:");
		String order = sc.next();
		String nonveg =sc.next();
		double totalorder=0;
		
		switch (order) {
		case "nonveg"-> {
			switch(nonveg) {
			case "chikenb" -> {
				System.out.println("chikenb price is 250/rs");
				double chikenbprive=250;
				totalorder +=chikenbprive;
				
			}
			
			case "muttenb" ->{
				System.out.println("muttenb price is 450/rs");
				double muttenbprive=450;
				totalorder +=muttenbprive;
			}
			 
			}
		}
		case "veg" ->{
			
		}
		}

	}

}
