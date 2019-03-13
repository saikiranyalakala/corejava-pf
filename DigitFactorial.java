package com.ass2;

import java.util.Scanner;

public class DigitFactorial {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int temp=n,count=0;
    while(temp>0){
    	count++;
    	temp=temp/10;
    }
    int []a=new int[count];
    int k=0,r=0;
    while(n>0){
    r=n%10;
    a[k]=r;
    k++;
    n=n/10;
    }
  
    int fact=1;
    for(int i=0;i<count;i++)
    {
         while(r>0){
        	 fact=fact*r;
        	 r=r-1;
         }
    
    }
    System.out.println(fact);
    
    
	}

}
