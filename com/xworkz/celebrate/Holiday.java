package com.xworkz.celebrate;

import static com.xworkz.festival.Navaratri.prayers; //static import

class Holiday {
public static void main(String leave[])
{
	System.out.println("Holidays are meant to relax and rest");
	System.out.println("But Festival holidays meant to celebrate");
	System.out.println("\n");
	
	prayers();
	prayers();
	prayers();
	prayers();
	prayers();
	System.out.println("\n");
	
	double math=Math.random();
	System.out.println(math);
	
	String name="Shriraksha";
	System.out.println(name.toLowerCase());  //java.lang.string.toLowerCase
	
	System.out.println(name.toUpperCase());  //java.lang.string.toUpperCase
	
		char ch='a';
		System.out.println(Character.isDigit(ch));
		
	
	String lastName="Kundapur";
	boolean equal=name.equals(lastName); //java.lang.string.equals
	System.out.println("Is 2 string are equal? "+ equal);
	
	StringBuilder str= new StringBuilder("Java Programming Language");
	System.out.println(str.delete(4,15)); 
	
	System.out.println(leave[0]); //java.lang.ArrayIndexOutOfBoundsException
	
	int number=9/0;
	System.out.println(number);  //java.lang.ArithmeticException
	
	
}
}
