package prog;

public class pat3 {

	public static void main(String[] args)
	{
		int num=5;
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
				if(i>=j)
				{
					System.out.print(j+1);
				}
				System.out.print(" ");
			}
			System.out.println(" ");
		}

	}

}
