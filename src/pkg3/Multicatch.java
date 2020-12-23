package pkg3;

public class Multicatch {
	
	public static void main(String args[])
	{
		try
		{
			int a = args.length;
			int b = 45/a;
			System.out.println(" B : " + b);
			int c[] = {1};
			c[45] = 456;
		}
		catch (ArithmeticException e)
		{
			System.out.println(" Exception : " + e);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(" Exception : " + e);
		}
		
		System.out.println("After try/catch block ");
	}

}
