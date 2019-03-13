package com.ass7;

import java.util.Scanner;

public class NewNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int  n=sc.nextInt();
	    int temp=n;
	    int count =0;
	    while(temp>0)
	    {
	    	count++;
	    	temp=temp/10;
	    }
	    int [] a=new int[count];
	    int k=0;
	    int r=0;
	    while(n>0){
	    r=n%10;
	    a[k]=r;
	    k++;
	    n=n/10;
	    }
	  int sum=0;
      for(int i=0;i<count;i++)
      {
    	  while(a[i]>0){
    		  r=a[i]%10;
    		  sum=(sum+10)*a[i];
    		  
    	  }
      }
	}

}
