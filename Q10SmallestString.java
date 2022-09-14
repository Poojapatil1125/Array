package com.Array;
//10.You are having array of strings. Now you have to arrange
//strings in array on the basis of the length of each string.
//Smallest string will be first and so on.
public class Q10SmallestString {
	public static void main(String[] args) {
     String s[]= {"java","php","python","c","html","spring","reactjs"};
     System.out.println("arrange string in array on the basis of the length is ");
     for(int i=0;i<s.length;i++)
     {
    	 for(int j=i+1;j<s.length;j++)
    	 {
    		 if(s[i].length()>s[j].length())
    		 {
    			 String temp=s[i];
    			 s[i]=s[j];
    			 s[j]=temp;
    		 }
    	 }
    	 System.out.println(s[i]);
     }
	}
}
