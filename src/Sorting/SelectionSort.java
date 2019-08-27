package Sorting;

import java.util.Scanner;

public class SelectionSort 
{
	private static void swap(int []a,int i,int j)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = s.nextInt();
		int []a= new int [n];
		System.out.println("Enter the Element : ");
		for(int i=0 ; i<n ; i++)
		{
			a[i]=s.nextInt();
		} 
		
		//Selection Sorting
		for (int i=0 ; i<a.length-1 ; i++)
		{
			int min=i;
			for (int j=i+1 ; j<a.length ; j++)
			{
				if (a[min]>a[j])
				{
					min=j;
				}
			}
			swap( a , i , min );
		}
		System.out.println("After Selection Sorting : ");
		for(int i=0 ; i<n ; i++)
		{
			System.out.println(a[i]);
		} 
		
		
	}

}
