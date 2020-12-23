package pkg3;

public class Throwsdemo {
	
	static  void throws_demo() throws IllegalAccessException
	{
		System.out.println("Inside the function ... ");
		//throw new ArithmeticException("demo");
		throw new IllegalAccessException("demo");
	}
	
	public static void main(String args[])
	{
		try
		{
			throws_demo();
		}
		catch (IllegalAccessException e)
		{
			System.out.println("Inside the catch & the Exception : " + e);
		}
	}

}
