package com_inherit;

class A{
	int i = 10;
	private int j = 5; //Not accessible by sub classes
	
	void show_content()
	{
		System.out.println("I and J "  + i + j);
	}
}

class B extends A{
	int k;
	
	void display()
	{
		System.out.println("Inside B " + k + i);
	}
	
	void show_k()
	{
		System.out.println("Inside Sub class "+ k);
	}
}

public class Inhertitance {
	
	public static void main(String args[])
	{
		A superob = new A();
		B subob = new B();
		
		superob.show_content();
		
		subob.show_content();
		subob.display();
	}
}
