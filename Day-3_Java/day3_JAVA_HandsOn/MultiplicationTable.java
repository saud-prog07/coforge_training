package com.coforge.day3;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String args[]) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number Whose Table Needs To Be Printed");
		num=sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println( num + " x " + i + " = " + i*num);
		}
		sc.close();
	}
}
