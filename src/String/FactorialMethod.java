package String;

import java.util.Scanner;

public class FactorialMethod {
	public static int fact1(int n)
	{
		int fact2 = 1;
		for (int i=1 ; i<=n ; i++)
		{
			fact2 = fact2*i;
		}
		return fact2;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = s.nextInt();
	
		System.out.println("Factorial of  is "+fact1(n));
		
		System.out.println("Enter the next number: ");
		int n1 = s.nextInt();
	
		System.out.println("Factorial of  is "+fact1(n1));
  
    }

}
