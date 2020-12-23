package pkg4;

class Mythread implements Runnable
{
	String name;
	Thread t;
	
	Mythread(String msg)
	{
		name = msg;
		t = new Thread(this, msg);
		System.out.println("New Thread : " + t);
		t.start();
	}
	
	public void run()
	{
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println(name +" Thread : "+ i);
				Thread.sleep(1000);
			}
		}
		
		catch(InterruptedException e)
		{
			System.out.println("Main Interrupted...");
		}
		
		System.out.println(name + " is exited....");
	}
}

public class Enhancedthread {
	
	public static void main(String args[])
	{
		Mythread one = new Mythread("1");
		Mythread two = new Mythread("2");
		Mythread three = new Mythread("3");
		
		System.out.println("Is " + one.name + " alive...." + one.t.isAlive());
		System.out.println("Is " + two.name + " alive...." + two.t.isAlive());
		System.out.println("Is " + three.name + " alive...." + three.t.isAlive());
		
		try
		{
			System.out.println("Waiting for the thread.....");
			one.t.join();
			two.t.join();
			three.t.join();
		}
		
		catch (InterruptedException e)
		{
			System.out.println("Exception : " + e);
		}
		
		System.out.println("OVER OVER OVER..");

	}

}
