package prog;

public class fibonacci {

	public static void main(String[] args) {
		int a=0;int b = 1;
		int c=0 ;
		System.out.print (a+" ");
		System.out.print (b+" ");
		for(int k=2 ; k<100 ; k++)
		{
			while(c<100)
			{
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}
		}
		
	}

}
