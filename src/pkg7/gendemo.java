package pkg7;

class Gen<T>
{
	T ob;
	
	Gen(T k)
	{
		ob = k;
	}
	
	T returnitem()
	{
		return ob;
	}
	
	void display_type()
	{
		System.out.println("The Type of " + ob + " is " + ob.getClass().getName());
	}
}

public class gendemo {
	
	public static void main(String args[])
	{
		Gen<Integer> obj;
		
		obj = new Gen<Integer>(48);
		
		int k = obj.returnitem();
		
		System.out.println("Tha K value : " + k);
		
		obj.display_type();
		
		Gen<String> strobj = new Gen<String>("SIVA");
		
		String l = strobj.returnitem();
		
		System.out.println("The L value : "  + l);
		
		strobj.display_type();
		
	}

}
