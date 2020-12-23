package com;

class Test{
	int a,b;
	
	Test(int i, int j)
	{
		a = i;
		b = j;
	}
	
	boolean check(Test o)
	{
		if(o.a == a && o.b == b)
			return true;
		else
			return false;
	}
	
}

public class Obj {
	public static void main(String args[])
	{
		Test num1 = new Test(100, 20);
		//Test num2 = new Test(100,20);
		Test num3 = new Test(1,2);
		System.out.println("obj1 == obj2 " + num1.check(new Test(100,10)));
		System.out.println("obj1 == obj3 " + num1.check(num3));
	}

}
