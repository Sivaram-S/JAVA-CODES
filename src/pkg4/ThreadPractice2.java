package pkg4;

class A1 implements Runnable
{
	A1(String name)
	{
		new Thread(this, name).start();
		
	}
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName() + " is the current child Thread..");

		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("CHILD : " +i);
				Thread.sleep(1000);
			}
		}
		
		catch (InterruptedException e)
		{
			System.out.println("Exception : " + e);
		}
		
		System.out.println(Thread.currentThread().getName() + " Ended...");
	}
}

public class ThreadPractice2 {
	
	public static void main(String name[])
	{
		System.out.println(Thread.currentThread().getName() + " is the Main thread....");
		
		new A1("child");
		new A1("Child2");
		
		try
		{
			for(int j=0;j<5;j++)
			{
				System.out.println("Main : " + j);
				Thread.sleep(1000);
			}
		}
		
		catch(InterruptedException e)
		{
			System.out.println("Exception : " + e);
		}
		
		System.out.println(Thread.currentThread().getName() + " Ended...");
	}

}
