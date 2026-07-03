package com.coforge.day3;

import java.util.Scanner;

public class NumberReverse {
	public static void main(String args[]) {
		int num;
		int reverse = 0;
		int remainder = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number Which Needs To  Be Reversed");
		num = sc.nextInt();
		
		while(num != 0) {
			remainder = num % 10;
			reverse = (reverse * 10) + remainder;
			num = num / 10;
		}
		
		System.out.println("The Reverse Number is " + reverse);
		sc.close();
	}
}
