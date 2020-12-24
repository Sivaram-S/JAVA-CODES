package pkg5;

public class Typewrapperdemo {
	
	public static void main(String args[])
	{
		@SuppressWarnings("deprecation")
		Integer iob = new Integer("100");
		
		int i = iob.intValue();
		
		System.out.println(iob +"  " +i);
	}
}
