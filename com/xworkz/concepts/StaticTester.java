package com.xworkz.concepts;

import com.xworkz.concepts.staticproblem.Person;

public class StaticTester {

	public static void main(String[] args) {
	
		Person.name="MS Dhoni";
		Person.address="Ranchi";
		Person.dob="07/07/1981";
		Person.displayinfo();
		
		System.out.println("********************************");
		
		Person.name="Aishwarya Rai";
		Person.address="Mumbai";
		Person.dob="01/01/1980";
		Person.displayinfo();
		
	}

}
