package com.coforge.day4.abstraction;

public  abstract class TwoWheeler extends Vehicle {
	public void noOfWheels() {
		System.out.println("I Have Two Wheels");
	}
	public abstract void noOfEngine();
	
	public abstract void brandName();
}

