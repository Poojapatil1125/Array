package com.Array;
//3.WAP to create a dynamic array. Dynamic Array means when 
//user want to input the number more than size of array it 
//will increase the size of array without throwing exception.

public class Q3DynamicArray {
 public static void main(String[] args) {
	 int a[]=new int [5];
	 a[0]=10;
	 a[1]=20;
	 a[2]=30;
	 a[3]=40;
	 a[4]=50;
	 //System.out.println("Elements of Array are ");
	 a=new int[10];
	 
	 for(int i=0;i<a.length;i++)
	 {
		 System.out.print(a[i]+" ");
	 }
	// a=new int[7];
	 //a[5]=60;

}
}
