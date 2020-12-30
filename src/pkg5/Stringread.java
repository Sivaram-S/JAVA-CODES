package pkg5;

import java.io.*;

public class Stringread {
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		
		do
		{
			str = br.readLine();
			System.out.println(str);
		}while( !str.equals("stop"));
	}
}
