package Practice;

class Use
{
	int n;
	boolean setValue = false;
	
	synchronized void put(int n)
	{
		while(setValue)
		{
			try
			{
				wait();
			}
			
			catch(InterruptedException e)
			{
				System.out.println("Exception : " + e);
			}
		}
		
		this.n = n;
		setValue = true;
		System.out.println("PUT : " + n);
		notify();
	}
	
	synchronized int get()
	{
		while(!setValue)
		{
			try
			{
				wait();
			}
			
			catch(InterruptedException e)
			{
				System.out.println("Exception : " + e);
			}
		}
		
		setValue = false;
		System.out.println("GOT : " + n);
		notify();
		return n;
	}
}

class Producer implements Runnable
{
	Thread t;
	Use d;
	
	Producer(Use j)
	{
		d = j;
		t = new Thread(this, "PRODUCER");
		System.out.println("Starting the thread....." + t);
		t.start();
	}
	
	public void run()
	{
		int i = 0;
		while(true)
		{
			d.put(++i);
		}
	}
}

class Consumer implements Runnable
{
	Thread t;
	Use h;
	
	Consumer(Use k)
	{
		h = k;
		t = new Thread(this, "CONSUMER");
		System.out.println("Starting the thread....." + t);
		t.start();
	}
	
	public void run()
	{
		while(true)
		{
			h.get();
		}
	}
}

public class One {
	
	public static void main(String args[])
	{
		Use obj = new Use();
		new Producer(obj);
		new Consumer(obj);
	}

}
