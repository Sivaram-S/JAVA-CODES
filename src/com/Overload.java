package com;

class Suitcase{
	
	double height;
	double breath;
	double width;
	
	Suitcase(double x, double y, double z)
	{
		height = x;
		width = y;
		breath = z;
	}
	
	Suitcase()
	{
		height = width = breath = 0;
	}
	
	Suitcase(double dim)
	{
		height = width = breath = dim;
	}
	
	double volume()
	{
		return height*width*breath;
	}
	
}

public class Overload {
	public static void main(String args[])
	{
		Suitcase num1 = new Suitcase(5.0);
		Suitcase num2 = new Suitcase();
		Suitcase num3 = new Suitcase(1.0, 2.0, 1.0);
		
		System.out.println("The volume of num1 case : " + num1.volume());
		System.out.println("The Volume of num2 case : " + num2.volume());
		System.out.println("The Volume of num3 case : " + num3.volume());
		
		
		
	}
}
