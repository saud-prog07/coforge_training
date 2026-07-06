package com.coforge.day5.classwork;

 import java.io.FileNotFoundException;
 import java.io.FileReader;
 
public class ThrowsTest { 
	
	public static void myMethod() throws FileNotFoundException {
		 FileReader fr = new FileReader("Demo.txt");		
	}
	public static void main(String[] args){
		/* int a = 10/0; un-checked exception */
		
		/* FileReader fr = new FileReader("Demo.txt"); */
		
		try {
			ThrowsTest.myMethod();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
