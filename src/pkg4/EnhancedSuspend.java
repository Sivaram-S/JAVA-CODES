package pkg4;

class Demo2 implements Runnable
{
	String name;
	boolean suspendFlag;
	Thread t;
	
	Demo2(String msg)
	{
		name = msg;
		t = new Thread(this, msg);
		System.out.println("New Thread : " + t);
		suspendFlag = false;
		t.start();
	}
	
	public void run()
	{
		try
		{
			for(int i=0;i<15;i++)
			{
				System.out.println(name + " : " + i);
				Thread.sleep(500);
				synchronized(this)
				{
					while(suspendFlag)
					{
						wait();
					}
				}
			}
		}
		
		catch(InterruptedException e)
		{
			System.out.println("Exception : " + e);
		}
		
		System.out.println("Exiting......");
	}
	
	synchronized void resumeObj()
	{
		suspendFlag = false;
		notify();
	}
	
	void suspendObj()
	{
		suspendFlag = true;
	}
}

public class EnhancedSuspend {
	
	public static void main(String args[])
	{
		Demo2 a = new Demo2("FIRST");
		Demo2 b = new Demo2("SECOND");
		
		try
		{
			Thread.sleep(1000);
			a.suspendObj();
			System.out.println("Suspending First child Thread......");
			Thread.sleep(2000);
			a.resumeObj();
			System.out.println("Resuming First child Thread........");
			
			//Thread.sleep(1000);
			b.suspendObj();
			System.out.println("Suspending Second child Thread......");
			Thread.sleep(4000);
			b.resumeObj();
			System.out.println("Resuming Second child Thread.........");
		}
		
		catch(InterruptedException e)
		{
			System.out.println("Exception : " + e);
		}
		
		try
		{
			System.out.println("Wait for the Child......");
			a.t.join();
			b.t.join();
		}
		
		catch (InterruptedException e)
		{
			System.out.println("Exception : " + e);
		}
		
		System.out.println("Main THREAD OVER........");
	}
}
