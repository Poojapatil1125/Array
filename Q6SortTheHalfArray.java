package com.Array;
//6.Suppose that you are having an array of size N. 
//now your task is to sort the half array that is from 0 to
//N/2 in ascending order and N/2+1 to N in descending order. 

public class Q6SortTheHalfArray {
public static void main(String[] args) {
	int a[]= {9,1,2,3,4,5,6,7,8};
	int n=a.length;
	System.out.println("ascending and decending order is ");
	for(int i=0;i<n/2;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	System.out.print(a[i]+" ");
}
		for(int i=0;i<n/2+1;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		System.out.print(a[i]+" ");
	}
}
}
