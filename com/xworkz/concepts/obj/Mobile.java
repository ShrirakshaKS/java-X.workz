package com.xworkz.concepts.obj;

public class Mobile 
{	
	public static String founder;
	public String modelName;
	public String colorOfModel;
	public String yearOfRelease;
	public String price;
	
	public void displayInfo()
	{
		System.out.println("founder name(used static): " + founder);
		System.out.println("Model name is: "+ modelName);
		System.out.println("Color of the model is: "+ colorOfModel);
		System.out.println("Year of release: "+ yearOfRelease);
		System.out.println("Indian market price: "+ price);
	}
}
