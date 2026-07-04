package com.coforge.day4;

public class AreaCalculatorApp {
	public static void main(String args[]) {
		/*
		 * Rectangle rectangle = new Rectangle(); Triangle triangle = new Triangle();
		 * Square square = new Square(); rectangle.area(); triangle.area();
		 * square.area();
		 */

		Figure figure;
		figure = new Rectangle();
		figure.area();
		figure = new Square();
		figure.area();
		figure = new Triangle();
		figure.area();
		/* Triangle triangle = (Triangle) new Figure(5)) REVERSE IS NOT POSSIBLE; */
	}
}