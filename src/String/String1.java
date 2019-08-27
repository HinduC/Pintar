package String;

import java.util.Scanner;

//Program to find the string without using the built in methods os the given string

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = s.nextLine();
		char[] a= str.toCharArray();
		int i=0;
		try
		{
			for(;; i++)
			{
				char e = a[i];
				System.out.println(e);
			}	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			
		}
		System.out.println(i);
		

	}

}
