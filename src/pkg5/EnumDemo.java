package pkg5;

enum Apple
{
	Salem, Trichy, Thanjavur, Kumbakonam, Thiruvaiyaru, SWamimalai
}

public class EnumDemo {
	public static void main(String args[])
	{
		Apple ex;
		ex = Apple.SWamimalai;
		
		System.out.println("Apple type : " + ex);
		
		switch(ex)
		{
		case Salem:
			System.out.println("This is from Salem");
			break;
		
		case Trichy:
			System.out.println("this is from Tirchy");
			break;
		
		case Thanjavur:
			System.out.println("This is from Thanjavur");
			break;
		
		case Kumbakonam:
			System.out.println("This is from Kumbakonam");
			break;
		
		case Thiruvaiyaru:
			System.out.println("This is from Thiruvaiyaru");
			break;
		
		case SWamimalai:
			System.out.println("This is from Swamimalai");
			break;
		
		default:
			System.out.println("Sorry....");
		}
		
		Apple allapples[] = Apple.values();
		
		for(Apple x: allapples)
		{
			System.out.println(x);
		}
	}

}
