package pkg5;

public class Autobox {
	
	public static void main(String args[])
	{
		Integer obj1, obj2;
		
		int i;
		obj1 = 100;
		
		System.out.println("The First Integer " + obj1);
		System.out.println("The Changed Integer " + (obj1 * 100));
		
		++obj1;
		System.out.println("After increment ...  : "  + obj1);
		
		obj2 = (obj1 / 3) + obj1;
		
		System.out.println("The Second Integer....." + obj2);
		
		i = obj2;
		
		System.out.println("The I value : " + i);
		
		Integer k = 1000;
		int j = k.byteValue();
		System.out.println("Byte value : " + j);
		
		System.out.write('A');
	}

}
