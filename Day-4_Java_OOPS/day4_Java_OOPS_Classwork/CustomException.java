package com.coforge.day4.classwork;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age");
		int age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println("Welocome to vote");
		}else {
			try {
				throw new InvalidAgeException("Must be over 18");
			} catch (InvalidAgeException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	}


