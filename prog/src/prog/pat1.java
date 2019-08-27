package prog;

public class pat1 {

	public static void main(String[] args) 
	{
		int num=4;
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
				if(i>=j)
				{
					System.out.print("*"+" ");
				}
				System.out.print(" ");
			}
			System.out.println(" ");
		}

	}

}
