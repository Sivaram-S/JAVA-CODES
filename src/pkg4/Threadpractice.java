package pkg4;

public class Threadpractice {
	
	public static void main(String args[])
	{
		Thread t = Thread.currentThread();
		
		System.out.println("Current Thread : " + t);
		
		try
		{
			System.out.println("Running......");
			Thread.sleep(1000);
		}
		
		catch (InterruptedException e)
		{
			System.out.println("Exception : " +e);
		}
		
		System.out.println("Thread....over...");
		
	}

}
