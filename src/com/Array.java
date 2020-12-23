package com;

public class Array {
	
	public static void main(String[] args)
	{
		
		int sum = 0;
		int nums[] = {1,2,3,4,5,6};
		for(int x: nums) sum += x;
		System.out.println(sum);
		
		
		/*byte a = 120;
		int b = -40;
		
		int c = a | b;
		System.out.println(c);
		
		a = (byte) (a >> 1);
		System.out.println(a);*/
		
		/*byte b = (byte) 0xF1;
		int n = b >> 4;
		System.out.println(n & 0x0f);
		
		byte l = (byte) 255;
		System.out.println(l);*/
		
		/*int number[] = new int[4];
		number[0] = 89;
		number[1] = 45;
		number[2] = 8;
		number[3] = 6;
		
		System.out.println(number[0]);*/
		
		/*int matrix[][] = new int[2][3];
		
		for(int i=0; i<2; i++)
			for(int j=0; j<3; j++)
				matrix[i][j] = i+j;
		
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}*/
		
		/*int multi_dimension[][] = {{1,2,3},{4,5,6}};
		System.out.println(multi_dimension[1][0]);*/
		
		
	}

}
