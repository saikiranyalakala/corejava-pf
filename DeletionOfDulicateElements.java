package com.mock123;

import java.util.Scanner;

public class DeletionOfDulicateElements {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String s=sc.next();
     int []a=new int[s.length()];
     
     for(int i=0;i<s.length();i++)
     {
    	 a[i]=s.charAt(i);
     }
     
     
     for(int i=0;i<s.length();i++)
     {
    	 for(int j=i+1;j<s.length();j++)
    	 {
    		if(a[i]==a[j])
    		{
    		  a[j]=a[s.length()-1];
    		  j--;
    		  a.length--;
    		  
    		}
    	 }
     }
	}

}
