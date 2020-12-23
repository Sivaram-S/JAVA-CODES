package pkg4;


class Clicker implements Runnable
{
	long click = 0;
	Thread t;
	private volatile boolean running = true;
	
	Clicker(int p)
	{
		t = new Thread(this);
		t.setPriority(p);
	}
	
	public void run()
	{
		while(running)
		{
			click++;
		}
	}
	
	void stop()
	{
		running = false;
	}
	
	void start()
	{
		t.start();
	}
	
}
public class Prioritydemo {
	
	public static void main(String args[])
	{
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		
		Clicker h_p = new Clicker(Thread.NORM_PRIORITY + 2);
		Clicker l_p = new Clicker(Thread.NORM_PRIORITY - 2);
		
		h_p.start();
		l_p.start();
		
		try
		{
			System.out.println("Childs are running.......");
			Thread.sleep(10000);
		}
		
		catch (InterruptedException e)
		{
			System.out.println("Exception : " +e);
		}
		
		h_p.stop();
		l_p.stop();
		
		System.out.println("Is Child 1 Alive....." + h_p.t.isAlive());
		System.out.println("Is child 2 Alive....." + l_p.t.isAlive());
		
		try
		{
			System.out.println("Waiting.....");
			h_p.t.join();
			l_p.t.join();
		}
		
		catch(InterruptedException e)
		{
			System.out.println("Exception : " + e);
		}
		
		System.out.println(h_p.click);
		System.out.println(l_p.click);
		
		System.out.println("Is Child 1 Alive....." + h_p.t.isAlive());
		System.out.println("Is child 2 Alive...." + l_p.t.isAlive());
	}

}
