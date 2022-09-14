package com.Array;
//2.WAP to find duplicate numbers and there counting from 
//list of numbers.
public class Q2DuplicateNumber {
  public static void main(String[] args) {
	int a[]= {10,20,30,20,10,40};
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				count++;
				System.out.println("Duplicate number is "+a[j]);
			}
		}
	}
	System.out.println("Duplicate count numbers is "+count);
}
}
