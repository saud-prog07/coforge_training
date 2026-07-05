package com.coforge.day4.Handson;

public class Student {
	int stdid;
	String stdname;
	int stdmarks;

	public Student() {
		super();
	}

	public Student(int stdid, String stdname, int stdmarks) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		this.stdmarks = stdmarks;
	}

	public void displayDetails() {
		System.out.println("Student Id : " + stdid);
		System.out.println("Student Name : " + stdname);
		System.out.println("Student stdmarks : " + stdmarks);
	}
	
	public void getGrade() {
		
		if (stdmarks < 0 || stdmarks > 100) {
		    System.out.println("Invalid stdmarks");
		}		
		else if (stdmarks >= 90) {
			System.out.println("Grade A");
		}
		else if (stdmarks >= 80) {
			System.out.println("Grade B");
		}
		else if (stdmarks >= 70) {
			System.out.println("Grade C");
		}
		else if (stdmarks >= 60) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Grade F");
		}
	}
}
