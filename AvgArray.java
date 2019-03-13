package com.ass7;

import java.util.Scanner;

public class AvgArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		float sum=0;
		for(int i=0;i<n;i++){
			sum=sum+a[i];
		}
   System.out.printf("%.2f",sum/n);
	}

}
