package pkg4;

class Q1
{
	int n;
	boolean ValueSet = false;
	
	synchronized void put(int n)
	{
		while(ValueSet)
		{
			try
			{
				wait();
			}
			
			catch(InterruptedException e)
			{
				System.out.println("InterruptedException Caught...");
			}
		}
		
		this.n = n;
		ValueSet = true;
		System.out.println("PUT : " + n);
		notify();
	}
	
	synchronized int get()
	{
		while(!ValueSet)
		{
			try
			{
				wait();
			}
			
			catch(InterruptedException e)
			{
				System.out.println("InterruptedException Caught...");
			}
		}
		
		System.out.println("GOT : " + n);
		ValueSet = false;
		notify();
		return n;
	}
}

class Producer1 implements Runnable
{
	Q1 q;
	
	Producer1(Q1 obj)
	{
		q = obj;
		new Thread(this, "PRODUCER").start();
	}
	
	public void run()
	{
		int i = 0;
		while(true)
		{
			q.put(i++);
		}
	}
}

class Consumer1 implements Runnable
{
	Q1 q;
	
	Consumer1(Q1 obj)
	{
		q = obj;
		new Thread(this, "CONSUMER").start();
	}
	
	public void run()
	{
		while(true)
		{
			q.get();
		}
	}
}

public class Enchancedinterthread {
	
	public static void main(String args[])
	{
		Q1 objc = new Q1();
		
		new Producer1(objc);
		new Consumer1(objc);
		
		System.out.println("Ctrl - C to exit.......");
	}
}
