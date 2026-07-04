package com.coforge.day4.exception;

public class ExceptionTest {

	public static void main(String args[]) {
		System.out.println("Before Exception");

		/* int a=10/0; */ /* java.lang.ArithmeticException */

		try {
			/*
			 * int a = 10 / 0; int a1 = Integer.parseInt("ABC");
			 */
			int[] ac = new int[-5];
			
		} catch (ArithmeticException e) {
			System.out.println("Error " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Error " + e.getMessage());
		}catch(Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
		System.out.println("After Exception");
	}
}

/* int a = Integer.parseInt("abc");java.lang.NumberFormatException */

/* int[] ar = { 10, 20, 30 }; */
/* System.out.println(ar[3]); java.lang.ArrayIndexOutOfBoundsException */

/* int[] ac = new int[-5]; java.lang.NegativeArraySizeException */

/* String s = null; */
/* System.out.println(s.length());java.lang.NullPointerException */