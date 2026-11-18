package com.ifandelse;import java.util.Scanner;

public class TestLs12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	   
		System.out.println("menu");
		System.out.println("1.pizza = 200rs");
		System.out.println("2.burgar = 120rs");
		System.out.println("3.biriyani = 180rs");
		System.out.println("4.noodles = 100rs");
		
		System.out.println("slect your food item:");
		int choice = sc.nextInt();
		
		System.out.println("enter quentity:");
		int quentity = sc. nextInt();
		
		String item="";
		int price =0;
	
		switch (choice) {
		case 1:
			item="pizza";
			price=200;
			break;
		case 2:
			item="burgar";
			price=120;
			break;
		case 3:
			item="biriyani";
			price=180;
			break;
		case 4:
			item="noodles";
			price=100;
			break;
		default:
			System.out.println("invalide item");
			sc.close();
			return;
		}
		if(quentity<=0) {
			System.out.println("invalid number");
		}else {
			int totalbill=price * quentity;
			
			System.out.println("Food item: " + item);
            System.out.println("Price: " + price + " Rs");
            System.out.println("Quantity: " + quentity);
            System.out.println("Total bill: " + totalbill + " Rs");
		}
		sc.close();

		
		

	}

}
