package String;

import java.util.Scanner;

//Program to find the string without using the built in methods os the given string

public class StringCountAlphabets {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = s.nextLine();
		char[] a= str.toCharArray();
		int count = 0;
		int i;
		for(i = 0; i<a.length;i++)
		{
			if(a[i]>='a' && a[i]<='z' || a[i] >='A' && a[i]<='Z')
			{
				count++;
			}
		}
		
		System.out.println(count);
	}

}
