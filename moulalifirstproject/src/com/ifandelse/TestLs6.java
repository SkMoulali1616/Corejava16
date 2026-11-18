package com.ifandelse;

import java.util.Scanner;

public class TestLs6 {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter a number of month");
       int month = sc. nextInt();
       
       switch (month) {
       case 1-> System.out.println(" january");
       case 2-> System.out.println(" february");
       case 3-> System.out.println(" march");
       case 4-> System.out.println(" aprial");
       case 5-> System.out.println(" may");
       case 6-> System.out.println(" jun");
       case 7-> System.out.println(" july");
       case 8-> System.out.println(" august");
       case 9-> System.out.println(" september");
       case 10-> System.out.println(" october");
       case 11-> System.out.println(" november");
       case 12-> System.out.println(" december");
       default -> System .out.println(" invalid number");
       }

	}
}
