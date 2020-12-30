package pkg7;

class Gen2<T, V>
{
	T obj1;
	V obj2;
	
	Gen2(T x, V y)
	{
		obj1 = x;
		obj2 = y;
	}
	
	T getobj1()
	{
		return obj1;
	}
	
	V getobj2()
	{
		return obj2;
	}
	
	void display()
	{
		System.out.println("The object " + obj1 +" is of type " + obj1.getClass().getName());
		System.out.println("The object " + obj2 +" is of type " + obj1.getClass().getName());
		
	}
	
}

public class Gendemo2 {
	
	public static void main(String args[])
	{
		Gen2<Integer, String> l = new Gen2<Integer, String>(45,"Sivaram");
		
		String p = l.getobj2();
		int i = l.getobj1();
		
		System.out.println("String : " + p + " int : " + i);
		
		l.display();
	}

}
