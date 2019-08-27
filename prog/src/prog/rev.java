package prog;

public class rev 
{
	public static void main(String[] args) 
	{
		String str="I Love Selenium Abcc Java";
		String[] s=str.split(" ");
		String temp=" ";
		for (int i=0; i<s.length;i++)
		{
			for(int j=0; j<s.length-1;j++)
			{
				if(s[j].compareTo(s[j+1])>0)
				{
					temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
		for(int i=0;i<s.length;i++)
		{
		System.out.println(s[i]);
		}
	}

}

