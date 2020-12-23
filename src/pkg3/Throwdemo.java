package pkg3;

public class Throwdemo {
	
	static void demo()
	{
		try
		{
			throw new NullPointerException("demo");
		}
		catch (NullPointerException e)
		{
			System.out.println("Exception : " + e);
			throw new ArithmeticException("DEMO1");
		}
	}
	
	public static void main(String args[])
	{
		try
		{
			demo();
		}
		catch (ArithmeticException e)
		{
			System.out.println("Exception : " + e);
		}
	}
}
