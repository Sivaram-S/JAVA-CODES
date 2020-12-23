package com_inherit;

class I
{
	void callme()
	{
		System.out.println("Inside I class..");
	}
}

class J extends I
{
	void callme()
	{
		System.out.println("Inside J class..");
	}
}

class K extends J
{
	void callme()
	{
		System.out.println("Inside K class..");
	}
}

public class Dynamicdemo {
	
	public static void main(String args[])
	{
		I obj3 = new I();
		obj3.callme();
		
		I obj = new J();
		obj.callme();
		
		I obj1 = new K();
		obj1.callme();
	}

}
