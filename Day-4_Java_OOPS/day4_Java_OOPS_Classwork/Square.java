package com.coforge.day4;

public class Square extends Figure {
	public Square() {
		super(5);
	}

	public void area() {
		int area2 = getSide() * getSide();
		System.out.println(area2);
	}
}
