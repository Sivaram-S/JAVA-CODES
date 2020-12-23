package com_inherit;

class First{
	private int i=5;
	
	void show()
	{
		System.out.println(i);
	}
}

class Second extends First{
	private int k = 6;
	
	void show()
	{
		super.show();
		System.out.println(k);
	}
}
public class Methodoverride {
	
	public static void main(String args[])
	{
		First obj = new Second();
		obj.show();
		
		First obj1 = new First();
		obj1.show();
	}

}
