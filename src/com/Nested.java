package com;

class Outer{
	
	int outer_a = 5;
	private double n = 5.6;
	
	void display()
	{
		Inner inner = new Inner();
		inner.test();
		System.out.println(inner.x);
	}
	
	class Inner{
		
		private int x = 5;
		
		void test()
		{
			System.out.println("INNER : "  + outer_a + " " + n);
		}
		
	}
}

public class Nested {
	
	public static void main(String args[])
	{
		Outer outer = new Outer();
		outer.display();		
		
		System.out.println(" ");
		
		Outer.Inner in = outer.new Inner();   //2 ways of accessing the members of the nested class
		in.test();
		//System.out.println(in.x);
	}

}
