package com.coforge.day3;
import java.util.Scanner;

public class CalculatorApp {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int result=0;
		String confirmation;
		System.out.println("Enter Two Numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		do {		
		System.out.println("1.Add\n2.Subtraction\n3.Mul\n4.Div\n5.Exit");
		System.out.println("Enter The Choice");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			result = a + b;
			System.out.println("The Result is " + result);
			break;	
		case 2:
			result = a - b;
			System.out.println("The Result is " + result);
			break;
		case 3:
			result = a * b;
			System.out.println("The Result is " + result);
			break;	
		case 4:
			result = a / b;
			System.out.println("The Result is " + result);
			break;	
		case 5:
			System.exit(0);
		}
		System.out.println("Do You Want to Continue Yes/No");
		confirmation = sc.next();
	}while(confirmation.equalsIgnoreCase("Yes"));
		
		sc.close();
 }
}
