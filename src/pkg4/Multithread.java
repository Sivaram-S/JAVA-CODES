package pkg4;

class Thread_demo2 implements Runnable
{
	Thread t;
	
	Thread_demo2(String msg)
	{
		t = new Thread(this, msg);
		System.out.println("Child Thread : " + msg);
		t.start();
	}
	
	public void run()
	{
		try
		{
			for(int i = 5; i > 0 ;i--)
			{
				System.out.println("Child Thread : " + i);
				Thread.sleep(500);
			}
		}
		
		catch (InterruptedException e)
		{
			System.out.println("Exception : " +e);
		}
		
		System.out.println("Child Ended....");
	}
}

public class Multithread {
	
	public static void main(String args[])
	{
		Thread k = Thread.currentThread();
		System.out.println("MAin Thread : " + k);
		
		new Thread_demo2("Number 1");
		new Thread_demo2("Number 2");
		new Thread_demo2("Number 3");
		
		try
		{
			for(int l=5;l>0;l--)
			{
				System.out.println("Main Thread : " + l);
				Thread.sleep(1000);
			}	
		}
		
		catch (InterruptedException e)
		{
			System.out.println("Exception : " + e);
		}
		
		System.out.println("Main Ended....");
	}
}
