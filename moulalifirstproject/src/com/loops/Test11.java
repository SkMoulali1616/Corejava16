package com.loops;

import java.util.Random;
import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Random r = new Random();
		
		int randonbumber = r.nextInt(4);
		
		int guess;
		
		for (int i=1; i<=3;i++) {
			System.out.println(" guess the random number");
			
			guess = sc.nextInt();
			
			if(guess ==randonbumber) {
				System.out.println("congratulation your number is corret");
				break;
			}else if(guess<randonbumber) {
				System.out.println("to low");
			}else {
				System.out.println("to high");
			}
			
			
			
		}
		System.out.println(" rnum is:" + randonbumber);
		
	}

}
