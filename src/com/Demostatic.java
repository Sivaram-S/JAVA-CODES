package com;

class Demo {
	static int a;
	
	static {
		System.out.println("Static DEmo block....");
		a = 45;
	}
	
	static void method() 
	{
		System.out.println(a);
	}
}

public class Demostatic {
	
	static int a = 5;
	static int b;
	
	static void meth(int item)
	{
		System.out.println("item : " + item);
		System.out.println("a    : " + a);
		System.out.println("c :" + b);
	}
	
	static {
		System.out.println("Static block initialized");
		b = a * 4;
	}
	
	public static void main(String args[])
	{
		Demo.method();
		meth(45);
	}

}
