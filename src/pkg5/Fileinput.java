package pkg5;

import java.io.*;

public class Fileinput {
	
	public static void main(String args[]) throws IOException
	{
		int i;
		FileInputStream fin = null;
		
		try
		{
			fin = new FileInputStream(args[0]);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Exception : " + e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception : " + e);
		}
		
		do
		{
			i = fin.read();
			if(i != -1) 
				System.out.println( (char) i);
		}while(i != -1);
		
		fin.close();
	}

}
