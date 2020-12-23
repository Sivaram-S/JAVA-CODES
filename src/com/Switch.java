package com;

public class Switch {
	public static void main(String args[])
	{
		for(int i = 0; i <= 2; i++)
		{
			switch(i) 
			{
			case 0:
				System.out.println('0');
				break;
			
			case 1:
				System.out.println('1');
				break;
			
			case 2:
				System.out.println('2');
				break;
				
			default:
				System.out.println("MMM");
			}	
		}
	}

}
