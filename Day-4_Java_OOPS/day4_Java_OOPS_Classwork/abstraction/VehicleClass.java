package com.coforge.day4.abstraction;

public class VehicleClass {
	public static void main(String args[]) {
//		Bike r15 = new Bike();
//		r15.brandName();
//		r15.noOfWheels();
//		r15.noOfEngine();
//		Scooty activa = new Scooty();
//		activa.brandName();
//		activa.noOfEngine();
//		activa.noOfWheels();
		
		VehiclePlan vehicle;
		vehicle = new Scooty();
		vehicle.brandName();
		vehicle.noOfEngine();
		vehicle.noOfWheels();
		vehicle = new Bike();
		vehicle.brandName();
		vehicle.noOfEngine();
		vehicle.noOfWheels();
	}
}
 