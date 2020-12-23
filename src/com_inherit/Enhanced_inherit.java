package com_inherit;

class Box1{
	
	private double height;
	private double width;
	private double breath;
	
	Box1()
	{
		height=width=breath = -1;
	}
	
	Box1(double item)
	{
		height = width = breath = item;
	}
	
	Box1(double x, double y, double v)
	{
		height = x;
		width = y;
		breath = v;
	}
	
	Box1(Box1 ob)
	{
		height = ob.height;
		width = ob.width;
		breath = ob.breath;
	}
	
	double volume()
	{
		return height*breath*width;
	}
	
}

class Boxweight1 extends Box1{
	
	private double weight;
	
	Boxweight1(double x, double y, double z, double t)
	{
		super(x,y,z);
		weight = t;
		
	}
	
	Boxweight1(double item, double w)
	{
		super(item);
		weight = w;
	}
	
	Boxweight1(Box1 obj, double y)
	{
		super(obj);
		weight = y;
	}
	
	Boxweight1(double u)
	{
		super();
		weight = u;
	}
	
	void display()
	{
		System.out.println("Weight : "+ weight);
	}
	
}

public class Enhanced_inherit {
	
	public static void main(String args[])
	{
		Boxweight1 box1 = new Boxweight1(15,3);
		Boxweight1 box2 = new Boxweight1(1,2,3,5);
		Boxweight1 box3 = new Boxweight1(5);
		Boxweight1 box4 = new Boxweight1(box1,5);
		
		double j1 = box1.volume();
		double j2 = box2.volume();
		double j3 = box3.volume();
		double j4 = box4.volume();
		
		System.out.println("Volume : "+ j1 + " " + j2+" "+j3+" "+j4);
	}

}
