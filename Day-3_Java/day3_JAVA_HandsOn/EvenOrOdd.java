package com.coforge.day3;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String args[]) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number TO be Checked");
		num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println(num + " is Even");
		}
		else {
			System.out.println(num + " is Odd");
		}
		sc.close();
	}
}
