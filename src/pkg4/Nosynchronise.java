package pkg4;


class Caller
{
	
	/*synchronized*/ void call(String msg)
	{
		System.out.print(" [ " + msg);
		try
		{
			Thread.sleep(1000);
		}
		
		catch (InterruptedException e)
		{
			System.out.println("Exception : " + e);
		}
		
		System.out.println(" ] ");
	}
}

class Calling implements Runnable
{
	Caller obj1;
	Thread t;
	String show;
	
	Calling(Caller obj, String msg)
	{
		obj1 = obj;
		show = msg;
		t = new Thread(this);
		t.start();
	}
	
	public void run()
	{
		synchronized(obj1)
		{
			obj1.call(show);
		}
	}
}
public class Nosynchronise {
	
	public static void main(String args[])
	{
		Caller c = new Caller();
		
		Calling one = new Calling(c, "Hello");
		Calling two = new Calling(c, "Wrold");
		Calling three = new Calling(c, "JAVA");
		
		try
		{
			one.t.join();
			two.t.join();
			three.t.join();
		}
		
		catch (InterruptedException e)
		{
			System.out.println("Exception : " +e);
			
		}
	}

}
