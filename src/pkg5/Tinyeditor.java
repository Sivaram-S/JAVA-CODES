package pkg5;

import java.io.*;

public class Tinyeditor {
	
	public static void  main(String args[]) throws IOException
	{
		String str[] = new String[100];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter 'stop' to quit....");
		
		for(int i=0;i<100;i++)
		{
			str[i] = br.readLine();
			if(str[i].equals("stop"))
				break;
		}
		
		System.out.println("The File is as follows.....");
		
		for(int i=0;i<100;i++)
		{
			if(str[i].equals("stop"))
				break;
			System.out.println(str[i]);
		}
		
	}

}
