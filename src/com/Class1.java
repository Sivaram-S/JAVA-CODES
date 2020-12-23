package com;

class Box{
	
	double height;
	double width;
	double breath;
	
	Box(double x, double y ,double z)
	{
		width = x;
		height = y;
		breath = z;
	}
	
	double volume()
	{
		return width*height*breath;
	}
}


public class Class1 {
	
	public static void main(String args[])
	{
		Box mybox = new Box(12.0, 5.3, 3.21);
		System.out.println("The Volume is :" + mybox.volume());
	}

}
