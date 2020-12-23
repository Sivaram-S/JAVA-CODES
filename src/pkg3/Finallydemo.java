package pkg3;

public class Finallydemo {
	
	static void first()
	{
		try
		{
			System.out.println("Inside the first function ");
			throw new RuntimeException("demo1"); 
		}
		finally
		{
			System.out.println("First function BYE");
		}
	}
	
	static void second()
	{
		try
		{
			System.out.println("Inside the second function ");
			return;
		}
		finally
		{
			System.out.println("Second function BYE");
		}
	}
	
	static void third()
	{
		try
		{
			System.out.println("Inside the third function ");
		}
		finally
		{
			System.out.println("Third function BYE");
		}
	}
	
	public static void main(String args[])
	{
		try
		{
			first();
		}
		catch (Exception e)
		{
			System.out.println(" Exception : " + e);
		}
		
		second();
		third();
	}

}
