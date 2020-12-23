package pkg3;

public class Nestedcatch {
	
	public static void main(String args[])
	{
		try
		{
			int a = args.length;
			
			int b = 45/a;
			
			System.out.println(" B : " + b);
			
			try
			{
				if(a == 1) a = a/(a-a);
				
				if(a == 2) 
				{
					int c[] = {1};
					c[45] = 65;
				}
				
			} 
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Exception : " + e);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception : " + e);
		}
		
		System.out.println("Outside Try/Catch ");
	}

}
