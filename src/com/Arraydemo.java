package com;

public class Arraydemo {
	
	public static void main(String args[])
	{
		int stck[] = new int[5];
		
		int temp[] = new int[7];
		
		for(int i=0; i<stck.length ; i++)
		{
			stck[i] = i;
		}
		
		for(int j=0; j<stck.length; j++)
		{
			temp[j] = stck[j];
		}
		
		stck = temp;
		
		System.out.println(stck.length);
		
	}
	

}
