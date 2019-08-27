package String;

public class ReverseWordCap_Small {

	public static void main(String[] args) {
		String str = "Hi  this  is  Rita  ";
		System.out.println(" The String is : " +str);
		
		char [] a= str.toCharArray();
		int i;
		for ( i=0 ; i<a.length ; i++) 
		{
			int s=i;
			int k = s;
			while(i<a.length && a[i]!=' ')
			{
				i++;		
			}
			int e=i-1;
			while(s<=e)
			{
				// a Word initCAP case
				if(a[k]>='a' && a[k]<='z')
				{
					a[k]=(char)(a[k]-32);
				}
				//a word second char is LOWER CASE
				if(a[s]>='A' && a[s]<='Z')
				{
					a[s]=(char)(a[s]+32);
				}
				s++;
			}
		}
		str = new String(a);
		System.out.println("reversed String is : " +a);

	}

}


