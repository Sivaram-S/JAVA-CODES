package pkg5;

enum Apple1
{
	TypeA(12), TypeB(56), TypeC(45), TypeD;
	
	int price;
	
	Apple1(int p)
	{
		price = p;
	}
	
	Apple1()  //overloading in Enumeration
	{
		price = -1;
	}
	
	int getPrice()
	{
		return price;
	}
}

public class EnumConst {
	
	public static void main(String args[])
	{
		Apple1 ap = Apple1.TypeA;
		System.out.println("Apple typeA price is : " +ap + " : " + ap.getPrice());
		
		for(Apple1 a:Apple1.values())
		{
			System.out.println("Apple type : " + a + " price is " + a.getPrice() + " cents");
		}
		
		System.out.println(Apple1.TypeC.compareTo(Apple1.TypeA));
	}
}
