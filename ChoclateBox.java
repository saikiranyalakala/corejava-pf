package com.mock123;

import java.util.Scanner;

public class ChoclateBox {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [][]a=new int[n][n];
        int sum1=0;int sum2=0;
        
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		a[i][j]=sc.nextInt();
        	}
        }
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i<j)
				{
					sum1=sum1+a[i][j];
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>j)
				{
					sum2=sum2+a[i][j];
				}
			}
		}
		System.out.println(sum1);
		System.out.println(sum2);
	}

}
