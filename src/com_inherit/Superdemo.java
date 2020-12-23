package com_inherit;

class A1{
	int i;
}

class B1 extends A1{
	
	int i;
	
	B1(int a,int b)
	{
		super.i = a;
		i = b;
	}
	
	void display()
	{
		System.out.println("Superclass I : "+ super.i);
		System.out.println("Subclass   I : "+ i);
	}
}

public class Superdemo {
	
	
	public static void main(String args[])
	{
		B1 subobj = new B1(4,5);
		subobj.display();
	}
	

}
