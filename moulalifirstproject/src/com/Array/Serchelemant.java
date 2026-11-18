package com.Array;

public class Serchelemant {

	public static void main(String[] args) {

		int a[] = { 10, 4, 7, 3, 9, 8 };

		int serch = 0;
		boolean found = false;

		for (int i = 0; i < a.length; i++) {

			if (a[i] == serch) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("number is found");
		} else {
			System.out.println("number not found");
		}

	}

}
