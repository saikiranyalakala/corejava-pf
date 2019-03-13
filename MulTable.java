package com.mock123;

import java.util.Scanner;

public class MulTable {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	
	int[][]a=new int[n][m];
	int k=n*m;
	int []a1=new int[k];
	int s=0;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
			a[i][j]=(i+1)*(j+1);
			a1[s]=a[i][j];
			System.out.print(a1[s]+" ");
			s++;
			
		}
		
	  }

	for(int i=0;i<k;i++)
	{
		for(int j=i+1;j<k;j++)
		{
			if(a1[i]==a1[j])
			{
				a1[j]=a1[k-1]; 
				k--;
				j--;
			}
		}
		
	}
	System.out.println(k);

		 
	}

}
