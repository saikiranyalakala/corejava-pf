package com.ass1;

import java.util.Scanner;

public class SumOfPrimeNumbers {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int [] a=new int[n];
	
	for(int i=0;i<a.length;i++){
		a[i]=sc.nextInt();
	}
	
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		int isPrime=1;
	for(int j=2;j<a[i];j++)
	{
		if(a[i]%j==0)
		{
		isPrime=0;
		break;
		}
     	} 
		if(isPrime==1){
			sum=sum+a[i];
		
	       }
    }
	System.out.println(sum);
	}

}
