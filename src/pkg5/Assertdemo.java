package pkg5;

public class Assertdemo {
	
	static int  i = 4;
	
	static int test()
	{
		return i--;
	}
	
	public static void main(String args[])
	{
		int n = 0;
		for(int i=0;i<10;i++)
		{
			n = test();      //java -ea Assertdemo ---> in cmd
			assert n>0;
		
			System.out.println(" N :  " + n);
		}
	}
}
