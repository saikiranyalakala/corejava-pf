package com.mock123;

import java.util.Scanner;

public class SlidingNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	
	
	int[]a=new int[2];
	for(int i=n1;i<n2;i++)
	{
		int n=i;
		int r=0;
		int k=0;
	 while(n>0){
	  r=n%10;
	  a[k]=r;
	  k++;
	  n=n/10;
		}	
	
	
	if(Math.abs(a[0]-a[1])==1){
		System.out.println(i);
	
	}
	

	}

}
}
