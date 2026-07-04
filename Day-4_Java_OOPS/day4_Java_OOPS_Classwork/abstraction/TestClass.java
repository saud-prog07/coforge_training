package com.coforge.day4.abstraction;

public class TestClass implements C {
	public static void main(String args[]) {
		TestClass test = new TestClass();
		test.sum();
	}

	public void sum() {
		System.out.println(A.a + B.a); /* solving ambiguity*/
	}
}
