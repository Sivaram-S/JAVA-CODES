package pkg3;

@SuppressWarnings("serial")
class Myexception extends Exception
{
	@SuppressWarnings("unused")
	private int detail;
	
	Myexception(int a)
	{
		detail = a;
	}
	
	public String toString()
	{
		return "A is greater than 10";
	}
}

public class Customexception {
	
	static void compute(int a) throws Myexception
	{
		if(a > 10)
			throw  new Myexception(a);
	}
	
	public static void main(String args[])
	{
		try
		{
			compute(1);
			compute(12);
		}
		catch (Myexception e)
		{
			System.out.println("Exception : " + e);
		}
		
	}

}
