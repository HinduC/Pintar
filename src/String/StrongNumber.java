package String;

public class StrongNumber {
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
		int n = 122;
		System.out.println("The given number is : "+n);
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
