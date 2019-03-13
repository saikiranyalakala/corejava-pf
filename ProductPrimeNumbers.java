package com.ass1;

import java.util.Scanner;

public class ProductPrimeNumbers {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int temp=n;
	int c=0,r=0;
	while(temp>0){
	c++;
	temp=temp/10;
	}
	int[] a=new int[c];
	int k=0;
	while(n>0){
	r=n%10;
	a[k]=r;
	k++;
	n=n/10;
	} 
	
	int sum = 0;
    int flag=0;
	for(int i=0;i<c;i++)
	{
		for(int j=2;j<a[i];j++){
         if(a[i]%j==0)
         {
			flag=1;
			break;
		}
         else
         {
        	 flag=0;
         }
         
	}
		if(flag==1){
		sum=sum*a[i];	
		System.out.println(sum);
		}
		
		
	
	
	
	}

	}}
