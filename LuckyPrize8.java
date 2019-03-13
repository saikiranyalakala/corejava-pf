package com.practice1;

import java.util.Scanner;

public class LuckyPrize8 {

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
    int b,c=0,d=1;
   
    for(int i=0;i<count;i++)
    {
    	b=c;
    	c=d;
    	d=b+c;
    System.out.print(b);
    System.out.println(a[i]);
           if(b==a[i]){
        	 System.out.println("Winner");  
           
    	}
    
    	
    
    }
    
    
	}


}