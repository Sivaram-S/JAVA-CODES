package com_inherit;

class Box2{
	
	private double height;
	private double width;
	private double breath;
	
	Box2()
	{
		height = -1;
		width = -1;
		breath = -1;
	}
	
	Box2(double item)
	{
		height = width = breath = item;
	}
	
	Box2(double x, double u, double n)
	{
		height = x;
		width = u;
		breath = n;
	}
	
	Box2(Box2 ob)
	{
		height = ob.height;
		width =  ob.width;
		breath = ob.breath;
	}
	
	double volume()
	{
		return height*width*breath;
	}
}

class Boxweight2 extends Box2
{
	private double weight;
	
	Boxweight2()
	{
		super();
		weight = -1;
		
	}
	
	Boxweight2(double i, double t)
	{
		super(i);
		weight = t;
	}
	
	Boxweight2(double m)
	{
		super();
		weight = m;
	}
	
}

class Shipment extends Boxweight2{
	
	private double cost;
	
	Shipment()
	{
		super();
		cost = -1;
	}
	
	Shipment(double i, double h)
	{
		super(i);
		cost = h;
	}
	
	void display()
	{
		System.out.println(cost);
	}
	
}
public class Multilevel {
	
	public static void main(String args[])
	{
		Shipment obj = new Shipment(15, 2);
		
		double k = obj.volume();
		System.out.println(k);
		
		obj.display();
		
	}

}
