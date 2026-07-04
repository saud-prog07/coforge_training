package com.coforge.day4;

public class Triangle extends Figure{
	public Triangle() {
		super(6l,3l);
	}
	
	public void area() {
		long area3 = (getBase() * getHeight())/2;
		System.out.println(area3);
	}
}
