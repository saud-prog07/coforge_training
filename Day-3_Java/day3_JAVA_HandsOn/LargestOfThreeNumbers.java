package com.coforge.day3;

import java.util.Scanner;

public class LargestOfThreeNumbers {
	public static void main(String args[]) {
		int a;
		int b;
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three Numbers To be Compared");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a > b && a > c) {
			System.out.println(a + " is largest");
		}
		else if(b > c && b > a) {
			System.out.println(b + " is largest");
		}
		else {
			System.out.println(c + " is largest");
		}
		sc.close();
	}
}
