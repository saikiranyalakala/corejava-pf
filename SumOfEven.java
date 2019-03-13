package com.ass1;

import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int temp=n;
    int counter=0;
    int r=0;
    while(temp>0){
    	counter++;
    	temp=temp/10;
    }
   
    int[]a=new int [counter];
    int sum=0;
    
      while(n>0)
      {
    	  r=n%10;
    	  a[sum]=r;
    	  sum++;
    	  n=n/10;
    	  
      }
    for(int i=0;i<counter;i++){
    
    System.out.println(a[i]);
    }
	}

}
