package pkg2;

import java.util.Random;

interface Sharedconstants
{
	int no = 1;
	int ok = 25;
	int see = 4;
	int let = 6;
}

class Question implements Sharedconstants
{
	Random rand = new Random();
	
	int ask()
	{
		int prob = (int) (100 * rand.nextDouble());
		if(prob < 30)
			return no;
		else if(prob < 60)
			return ok;
		else if(prob < 75)
			return see;
		else
			return let;
	}
}

class Interfaceshared implements Sharedconstants
{
	static void answer(int result)
	{
		switch(result)
		{
		case no:
			System.out.println("No");
			break;
		case ok:
			System.out.println("ok");
			break;
		case see:
			System.out.println("see");
			break;
		case let:
			System.out.println("let");
			break;
		}
	}
	
	public static void main(String args[])
	{
		Question q = new Question();
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
	}
	

}
