package com.coforge.day4.Handson;

public class LibraryManagementSystem {

	public static void main(String[] args) {

		Library library = new Library();

		library.addBook(101, "Java Programming");
		library.addBook(102, "Python Programming");
		library.addBook(103, "Database Management");

		System.out.println();

		library.searchBook(102);

		System.out.println();

		library.issueBook(102);

		System.out.println();

		library.issueBook(102);

		System.out.println();

		library.returnBook(102);

		System.out.println();

		library.issueBook(102);

		System.out.println();

		library.searchBook(110);

		System.out.println();

		library.returnBook(110);
	}
}