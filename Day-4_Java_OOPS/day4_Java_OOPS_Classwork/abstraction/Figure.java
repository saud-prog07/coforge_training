package com.coforge.day4.abstraction;

public abstract class Figure implements AreaPlan {
	private int lenght;
	private int breadth;
	private int side;
	private long height;
	private long base;

	public Figure(int lenght, int breadth) {
		super();
		this.lenght = lenght;
		this.breadth = breadth;
	}

	public int getLenght() {
		return lenght;
	}

	public int getBreadth() {
		return breadth;
	}

	public int getSide() {
		return side;
	}

	public long getHeight() {
		return height;
	}

	public long getBase() {
		return base;
	}

	public Figure(int side) {
		super();
		this.side = side;
	}

	public Figure(long height, long base) {
		super();
		this.height = height;
		this.base = base;
	}

	public abstract void area();
}
