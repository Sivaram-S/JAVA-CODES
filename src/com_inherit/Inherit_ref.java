package com_inherit;

class Box{
	
	 double height;
	 double width;
	 double breath;
	
	Box()
	{
		height = 1.0;
		width = 1.0;
		breath = 1.0;
	}
	
	Box(double x)
	{
		height=width=breath = x;
	}
	
	Box(double m, double l, double k)
	{
		height = m;
		width = l;
		breath = k;
	}
	
	double volume()
	{
		return height*width*breath;
	}
}

class Boxweight extends Box
{
	double weight;
	
	Boxweight(double x, double y, double z, double w)
	{
		height = x;
		width = y;
		breath = z;
		weight = w;
	}
}

public class Inherit_ref {
	
	public static void main(String args[])
	{
		Boxweight subobj = new Boxweight(1.0,20.0,3.0,3.2);
		Box superobj = new Box(5);
		
		double b = subobj.volume();
		System.out.println(b);
		
		superobj = subobj;
		
		//superobj.weight; error
		
		double y = superobj.volume();
		System.out.println(y);
		
	}

}
