package prog;

public class p1 
{
	public static void main(String[] args)
	{
		String str ="i love java";
		String[] word = str.split(" ");
		for(int i=word.length-1 ; i>=0 ; i--)
		{
			if(i!=1)
			{
			System.out.print(word[i]+" ");
		}
		else
		{
			String str1 = new StringBuffer(word[i]).reverse().toString();
			System.out.print(str1+" ");
		}
		}
	}

}
