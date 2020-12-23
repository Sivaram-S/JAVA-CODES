package pkg4;

class Q
{
	int n;
	
	synchronized int get()
	{
		System.out.println("GET : " + n);
		return n;
	}
	
	synchronized void put(int n)
	{
		this.n = n;
		System.out.println("PUT : " + n);
	}
}

class Producer implements Runnable
{
	Q q;
	
	Producer(Q p)
	{
		q = p;
		new Thread(this, "PRODUCER ").start();
	}
	
	public void run()
	{
		int i=0;
		while(true)
		{
			q.put(i++);
		}
	}
}

class Consumer implements Runnable
{
	Q q;
	
	Consumer(Q p)
	{
		q = p;
		new Thread(this, "Consumer").start();
	}
	
	public void run()
	{
		while(true)
		{
			q.get();
		}
	}
}

public class Interthread {
	
	public static void main(String args[])
	{
		Q obj = new Q();
		
		new Producer(obj);
		new Consumer(obj);
		
		System.out.println("ctrl - C to exit....");
		
		
	}

}
