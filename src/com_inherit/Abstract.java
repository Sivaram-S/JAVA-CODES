package com_inherit;

abstract class Abs{
	abstract void callme();
	
	void call()
	{
		System.out.println("I am ok");
	}
}

class Bbs extends Abs{
	void callme()
	{
		System.out.println("I am in B..");
	}
	
	void get()
	{
		System.out.println("you can not catch me Abs..");
	}
}

public class Abstract {
	
	public static void main(String args[])
	{
		Abs obj = new Bbs();
		
		obj.callme();
		
		Object obj2 = new Bbs();
		int h = obj2.hashCode();
		System.out.println(h);
		String k = obj2.toString();
		System.out.println(k);
		
		obj.call();
		
		Bbs obj1 = new Bbs();
		
		obj1.get();
		
	}

}
