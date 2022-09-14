package com.Array;
//5.An Array Contain different numbers you have to find how
//many are even, odd, perfect and prime 
public class Q5EvenOdd {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8};
	int n=a.length;
	int evenno=0,oddno=0,p,perfectno=0,primecount=0,sum=0;
	for(int i=n;i>0;i--)
	{
		if(n%i==0)
		{
			primecount++;
		}
	}
	System.out.println("total prime no is "+primecount);
	for(int i=1;i<=n/2;i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
			perfectno++;
		}
	}
	System.out.println("total perfect no is "+perfectno);
	for(int i=0;i<a.length;i++)
	{
	if(a[i]%2==0)
	{
		evenno++;
	}
	else if(a[i]%2!=0)
	{
		oddno++;
	}
	}
	System.out.println("total even no is "+evenno);
	System.out.println("total odd no is "+oddno);
		
}
}
