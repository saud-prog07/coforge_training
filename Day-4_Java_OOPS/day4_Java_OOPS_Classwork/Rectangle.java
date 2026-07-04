package com.coforge.day4;

public class Rectangle extends Figure {

	public Rectangle() {
		super(5, 6);
	}

	@Override
	public void area() {
		int area1 = getLenght() * getBreadth();
		System.out.println(area1);
	}
}
