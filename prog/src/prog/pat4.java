package prog;

public class pat4 {

	public static void main(String[] args)
	{
		int num=4;
		int n=0;
		for(int i=1;i<num;i++)
		{
			int n1=n+i;
			for(int j=0;j<num;j++)
			{
				if(i>=j)
				{
					System.out.print(n1--);
				}
			//	System.out.print(" ");
			}
			n=n+i;
			System.out.println(" ");
		}

	}

}
