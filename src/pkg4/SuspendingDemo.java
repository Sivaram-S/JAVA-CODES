package pkg4;

class Demo implements Runnable
{
	Thread t;
	String name;
	
	Demo(String msg)
	{
		name = msg;
		t = new Thread(this, name);
		System.out.println("New Thread : " + name);
		t.start();
	}
	
	public void run()
	{
		try
		{
			for(int i=0;i<15;i++)
			{
				System.out.println(name  + " : "+ i);
				Thread.sleep(1000);
			}
		}
		
		catch (InterruptedException e)
		{
			System.out.println("Exception : " + e);
		}
		
		System.out.println("Child Thread Ended......");
	}
}

public class SuspendingDemo {
	
	@SuppressWarnings("deprecation")
	public static void main(String args[])
	{
		Demo obj1 = new Demo("child1");
		Demo obj2 = new Demo("child2");
		
		try
		{
			Thread.sleep(1000);
			obj1.t.suspend();
			System.out.println("Suspended Child Thread 1 ......");
			Thread.sleep(10000);
			System.out.println("Resuming Child Thread 1 .......");
			obj1.t.resume();
			Thread.sleep(1000);
			obj2.t.suspend();
			System.out.println("Suspending Child Thread 2.......");
			Thread.sleep(10000);
			System.out.println("Resuming Child Thread 2 ......");
			obj2.t.resume();
		}
		
		catch(InterruptedException e)
		{
			System.out.println("Exception : " + e);
		}
	}
}
