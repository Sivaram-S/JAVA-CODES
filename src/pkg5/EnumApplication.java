package pkg5;
import java.util.Random;

enum Answer
{
	No, Maybe, let, see;
}

class Question
{
	Random r = new Random();
	
	Answer ask()
	{
		int prob = (int) (100 * r.nextDouble());
		
		if(prob < 15)
			return Answer.let;
		else if(prob < 30)
			return Answer.Maybe;
		else if(prob < 65)
			return Answer.No;
		else
			return Answer.see;
	}
}

public class EnumApplication {
	
	static void solution(Answer a)
	{
		switch(a)
		{
		case let:
			System.out.println("LET....");
			break;
		
		case Maybe:
			System.out.println("Maybe......");
			break;
			
		case No:
			System.out.println("No.....");
			break;
		
		case see:
			System.out.println("See.....");
			break;
		}
	}
	
	public static void main(String args[])
	{
		Question g = new Question();
		
		solution(g.ask());
		solution(g.ask());
	}
}
