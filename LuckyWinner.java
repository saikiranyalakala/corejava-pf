package com.practice1;

import java.util.Scanner;

public class LuckyWinner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	   
	 
	    int temp=n,count=0;
	    while(temp>0){
	    	count++;
	    	temp=temp/10;
	    }
	   
	    int[]a=new int[count];
	    int k=0;
	    int r=0;
	    while(n>0){
	    r=n%10;
	    a[k]=r;
	    k++;
	    n=n/10;
	    }
	    int sum=0;int flag=0;
	    for(int i=0;i<count;i++)
	    {
	    	sum=sum+a[i];
	    }
	    for(int i=0;i<n;i++){
	    	for(int j=2;j<n;j++)
	    	{
	    		if(a[i]%j!=0)
	    		{
	
	                if(sum%3==0)
	                {
	    	         System.out.println("Winner");
	                 }
	    		}
	                 else{
	    	         System.out.println("Not a Winner");
	                 }
	    
	    	
	          }
	    	}	

	    	}
	    }
