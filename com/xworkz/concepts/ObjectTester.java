package com.xworkz.concepts;

import com.xworkz.concepts.obj.Vehicle;

public class ObjectTester {

	public static void main(String[] args) {
		
				
		Vehicle vehicle=new Vehicle();
		
		vehicle.model="Land Rover";
		vehicle.color="Yellow";
		Vehicle.owener="Ratan Tata";
		vehicle.displayInfo();
		
		System.out.println("*************************************");
		
			
		Vehicle vehicle2=new Vehicle();
		vehicle2.model="Nano";
		vehicle2.color="Blue";
		Vehicle.owener="Ratan Tata";
		vehicle2.displayInfo();		
	}
}
