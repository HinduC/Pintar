package String;

import java.util.Scanner;

public class StrongNumber2 {
	public static int fact(int n)
	{
		int fact2 = 1;
		for (int i=1 ; i<=n ; i++)
		{
			fact2 = fact2*i;
		}
		return fact2;
	}

	public static void main(String[] args) {
		Scanner s = new  Scanner(System.in);
		System.out.println("Enter number  : ");		
		int n = s.nextInt();
		int temp = n;
		int sum = 0;
		int d;
		while(n>0)
		{
			d=n%10;
			sum=fact(d)+sum;
			n=n/10;
			
		}
		System.out.println("The Factorial number is :"+sum);
		if(sum ==temp)
		{
			System.out.println(sum+"is String number");
		}
		else
		{
			System.out.println(sum+"is not strong number");
			
		}

	}

}
