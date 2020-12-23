package com;

public class Varargsdemo {
	
	static void test(boolean ... v)
	{
		System.out.println("Boolean....");
		
		System.out.print("Contents :" );
		for(boolean x: v)
		{
			System.out.print(x + "\t");
		}
		System.out.println(" ");
	}
	
	
	static void test(String msg,int ... v)
	{
		System.out.println(msg + " Length : " + v.length);
		
		System.out.print("Contents :" );
		for(int x: v)
		{
			System.out.print(x +"\t");
		}
		System.out.println(" ");
	}
	
	public static void main(String args[])
	{
		test("one",1);
		test("twow",1,2,3,4,5,6,4,5);
		test("ok");
		test(true, false, true);
	}

}
