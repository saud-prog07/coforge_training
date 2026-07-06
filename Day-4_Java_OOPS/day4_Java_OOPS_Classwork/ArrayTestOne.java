package com.coforge.day4.classwork;

import java.util.Scanner;

public class ArrayTestOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int arr[] = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Array[" + i + "] :" + arr[i]);
			sum += arr[i];
		}
		System.out.println("The Sum is: " + sum);
	}
}
