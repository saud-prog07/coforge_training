package com.coforge.day4.Handson;

public class Library {

	Book[] book;
	int count;
	boolean[] status;

	public Library() {
		book = new Book[10];
		status = new boolean[10];
		count = 0;
	}

	public void addBook(int bookId, String bookName) {

		book[count] = new Book(bookId, bookName);
		status[count] = true;
		count++;

		System.out.println("Book Added Successfully");
	}

	public void searchBook(int bookId) {

		for (int i = 0; i < count; i++) {

			if (book[i].getBookId() == bookId) {
				System.out.println("Book Found");
				System.out.println("Book ID : " + book[i].getBookId());
				System.out.println("Book Name : " + book[i].getBookName());
				return;
			}
		}

		System.out.println("Book Not Found");
	}

	public void issueBook(int bookId) {
		if (count == book.length) {
			System.out.println("Library is Full");
			return;
		}

		for (int i = 0; i < count; i++) {

			if (book[i].getBookId() == bookId) {

				if (status[i]) {
					status[i] = false;
					System.out.println(book[i].getBookName() + " Issued Successfully");
				} else {
					System.out.println("Book Already Issued");
				}
				return;
			}
		}

		System.out.println("Book Not Found");
	}

	public void returnBook(int bookId) {

		for (int i = 0; i < count; i++) {

			if (book[i].getBookId() == bookId) {

				System.out.println(book[i].getBookName() + " Returned Successfully");
				status[i] = true;
				return;
			}
		}

		System.out.println("Invalid Book ID");
	}

	public Book[] getBook() {
		return book;
	}

	public int getCount() {
		return count;
	}

}