package pkg2;

interface A
{
	void meth1();
	void meth2();
}

interface B extends A
{
	void meth3();
}

class Myclass implements B{
	
	public void meth1()
	{
		System.out.println("METH1");
	}
	
	public void meth2()
	{
		System.out.println("METH2");
	}
	
	public void meth3()
	{
		System.out.println("METH3");
	}
}

public class Interherit {
	
	public static void main(String args[])
	{
		Myclass obj = new Myclass();
		
		obj.meth1();
		obj.meth2();
		obj.meth3();
	}

}
