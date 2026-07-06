package com.coforge.day4.classwork;

import java.util.Scanner;

public class ArrayTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter Array Elements");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Array[" + i + "] :" + arr[i]);
			sum += arr[i];
		}
		System.out.println("The Sum is: " + sum);
	}
}
