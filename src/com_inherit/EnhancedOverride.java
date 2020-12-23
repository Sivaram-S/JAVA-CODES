package com_inherit;

class Figure{
	double dim1;
	double dim2;
	
	Figure(double i, double j)
	{
		dim1 = i;
		dim2 = j;
	}
	
	void area()
	{
		System.out.println("Area is undefined..");
	}
}

class Rectangle extends Figure{
	
	Rectangle(double i, double l)
	{
		super(i,l);
	}
	
	void area()
	{
		System.out.println("Area of Rectangle : " + (dim1 * dim2));
	}
	
}

class Triangle extends Figure{
	
	Triangle(double i, double k)
	{
		super(i,k);
	}
	
	void area()
	{
		System.out.println("Area of Triangle : " + (0.5 * dim1 * dim2));
	}
}

public class EnhancedOverride {
	
	public static void main(String args[])
	{
		Figure rect = new Rectangle(12.0,3.6);
		
		Figure tri = new Triangle(1.0,6.0);
		
		rect.area();
		tri.area();
	}

}
