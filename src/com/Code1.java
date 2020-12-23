package com;

public class Code1 {
	public static void main(String[] args)
	{
		int a = -1;
		int b = 1;
		int c;
		
		for(int i=0; i<5; i++)
		{
			c = a+b;
			System.out.print(c + "\t");
			a = b;
			b = c;
		}
		
		System.out.print("\n");
		
		String g = "\u0BB5\u0BA3\u0B95\u0BCD\u0B95\u0BAE\u0BCD";
		System.out.println(g);
		
		boolean k = true;
		
		if(k) System.out.println("This is executed");
		
		float p = 15.2f;
		System.out.println(p);
		
		int num = 0x10;
		System.out.println(num);
		
		char st = '\u0BB5';
		System.out.println(st);			
		
		float number = 323.20f;
		byte decimal;
		decimal = (byte) number;		
		System.out.println(decimal);
		
		/*byte b = 50 b = b * 2 Error *---> convert to in */
		
	}
}
