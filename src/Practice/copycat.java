package Practice;

import java.io.*;

public class copycat {
	
	public static void main(String args[]) throws IOException
	{
		int i;
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		try
		{
			fin = new FileInputStream(args[0]);
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println("File is not found.....");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception : " + e);
		}
		
		try
		{
			fout = new FileOutputStream(args[1]);
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println("File could not be made...");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception : " + e);
		}
		
		do
		{
			i = fin.read();
			if(i != -1)
				fout.write(i);
		}while(i != -1);
		
	}

}
