package pkg4;

class Participant1
{
	synchronized void foo(Participant2 obj)
	{
		String name = Thread.currentThread().getName();
		
		System.out.println(name + " Entered the Foo function of First class.....");
		
		try
		{
			Thread.sleep(1000);
		}
		
		catch(InterruptedException e)
		{
			System.out.println("Exception : " + e);
		}
		
		System.out.println(name + " is trying to call Participant2 functions......");
		obj.last();
	}
	
	synchronized void last()
	{
		System.out.println("Inside Participant1's last function....");
	}
}

class Participant2
{
	
	synchronized void bar(Participant1 obj)
	{
		String name = Thread.currentThread().getName();
		
		System.out.println(name + " Entered the bar function of Second class.......");
		
		try
		{
			Thread.sleep(1000);
		}
		
		catch(InterruptedException e)
		{
			System.out.println("Exception : " + e);
		}
		System.out.println(name + " is trying to call Participant1 functions.....");
		obj.last();
	}
	
	synchronized void last()
	{
		System.out.println("Inside PArticipant2's last function.....");
	}
}

class Deadlock implements Runnable
{
	Participant1 obj1 = new Participant1();
	Participant2 obj2 = new Participant2();
	
	Deadlock()
	{
		Thread.currentThread().setName("Main Thread");
		new Thread(this, "Racing Thread").start();
		obj1.foo(obj2);
	}
	
	public void run()
	{
		obj2.bar(obj1);
	}
}

public class Deadlockdemo {
	public static void main(String args[])
	{
		new Deadlock();
	}

}
