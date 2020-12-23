package pkg3;

public class Chainedexception {
	
	static void chained_demo()
	{
		NullPointerException e = new NullPointerException("Top Layer");
		e.initCause(new ArithmeticException("Cause"));
		
		throw e;
	}
	
	public static void main(String args[])
	{
		try
		{
			chained_demo();
		}
		catch (NullPointerException e)
		{
			System.out.println(" Exception : " + e);
			
			System.out.println(" Cause : " + e.getCause());
		}
	}
}
