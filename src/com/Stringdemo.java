package com;

public class Stringdemo {
	
	public static void main(String args[])
	{
		String str = "siva";
		String str2 = "ram";
		
		String g[] = new String[2];
		
		g[0] = "siva";
		g[1] = "swaminathan";
		
		System.out.println(g.length);
		System.out.println(g[1].length());
		
		System.out.println("The length of str : "+ str.length());
		System.out.println("The character at the position 1 in ram is : " + str2.charAt(1));
		
		if(str.equals(str2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}

}
