package Array;

public class SortingArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {10,20,5,2};
		
		int i=1,j=3;
		System.out.println("Before swapping anArray");
		for(int k=0 ; k<a.length ; k++)
		{
			System.out.println(a[k]);
		}
		//Swapping
		a[i]=a[i]+a[j];
		a[j]=a[i]-a[j];
		a[i]=a[i]-a[j];
		
		System.out.println("After swapping anArray");
		for(int k=0 ; k<a.length ; k++)
		{
			System.out.println(a[k]);
		}

	}

}
