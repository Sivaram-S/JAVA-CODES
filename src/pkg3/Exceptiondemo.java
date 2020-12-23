package pkg3;

public class Exceptiondemo {
	
	public static void main(String args[])
	{
		try 
		{
			int a = 0;
			int k = 6/a;
			System.out.println("This will not be printed" + k);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Divide by zero...");
			System.out.println("Exception : " + e);
		}
		System.out.println("Outside catch");
	}

}
