package com.coforge.day3;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String args[]) {
		int n;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Natural Number Till Where The  Sum Must be Calculated");
		n = sc.nextInt();
		
		for(int i=1; i <= n; i++) {
			sum += i;
		}
		System.out.println("The Sum Untill " + n + " is " + sum);
	}
}

