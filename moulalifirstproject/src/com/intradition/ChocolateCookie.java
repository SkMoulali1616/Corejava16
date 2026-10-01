package com.intradition;

import java.util.Scanner;

public class ChocolateCookie {

    static void calculateMoney() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total money: ");
        int totalMoney = sc.nextInt();

        System.out.print("Enter chocolate price: ");
        int chocolatePrice = sc.nextInt();

        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();

        System.out.print("Enter cookie price: ");
        int cookiePrice = sc.nextInt();

        System.out.print("Enter number of cookies: ");
        int cookies = sc.nextInt();

        int remainingMoney = totalMoney
                - (chocolates * chocolatePrice + cookies * cookiePrice);

        System.out.println("Remaining Money: ₹" + remainingMoney);

        sc.close();
    }

    public static void main(String[] args) {

        calculateMoney();
    }
}

