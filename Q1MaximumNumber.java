package com.Array;
//1.WAP to find third maximum number from list of numbers.
public class Q1MaximumNumber {
 public static void main(String[] args) {
	int a[]= {10,20,30,40,50,60,70,34};
	int size=a.length;
	for(int i=0;i<size;i++)
	{
		for(int j=i+1;j<size;j++)
		{
			if(a[i]>a[j]) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}
	}
	System.out.println("Third largest number is "+a[size-3]);
}
}
