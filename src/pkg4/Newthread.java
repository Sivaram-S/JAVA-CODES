package pkg4;


class NewThread1 implements Runnable
{
	Thread t;
	
	NewThread1()
	{
		t = new Thread(this, "SIVA-THREAD");
		System.out.println("Child Thread " + t);
		t.start();
	}
	
	public void run()
	{
		try
		{
			for(int i=6; i>0; i--)
			{
				System.out.println("Child Thread : " + i);
				Thread.sleep(500);
			}
		}
		catch (InterruptedException e)
		{
			System.out.println("Interrupted");
		}
		
		System.out.println("Child Thread Over..");
	}
}

public class Newthread {
	
	public static void main(String args[])
	{
		Thread t = Thread.currentThread();
		System.out.println("Main Thread : " + t);
		
		new NewThread1();
		try
		{
			for(int j=6; j>0 ; j--)
			{
				System.out.println("Main thread  : " +j);
				Thread.sleep(1000);
			}
		}
		
		catch (InterruptedException e)
		{
			System.out.println("Interrupted");
		}
		
		System.out.println("Main Thread over..");

	}

}
