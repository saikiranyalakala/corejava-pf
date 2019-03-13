package com.mock123;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int k=n*m;
	int []a=new int[k];
	int p=0;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
			a[p]=(i+1)*(j+1);
			p++;
		}
		
	}
	for(int i=0;i<k-1;i++)
	{
		for(int j=i+1;j<k;j++)
		{
			if(a[i]==a[j])
			{
				a[j]=a[k-1];
				
			}
		}
	
    }
	System.out.println(k);
	}
	
	
}
