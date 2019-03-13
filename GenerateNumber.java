package com.ass1;

import java.util.Scanner;

public class GenerateNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int temp=n;
     int count=0;
     while(temp>0){
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
     
     int t=0;
     for(int i=0;i<count;i++){
    	 for(int j=i+1;j<count;j++){
    		 t=a[i];
    		 a[i]=a[j];
    		 a[j]=temp;
    	 }
     }
     
    	 
     
     /*int sum=1;int p=0;
     for(int i=0;i<count;i++)
     {
    	 
	       if(a[i]%2==0)
    	   {
    		
         System.out.print(a[i]);
    		
    	   }
	       
    }*/
    	
     }
     
	}


