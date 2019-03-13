package com.ass1;

import java.util.Scanner;

public class SumTwoFive {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []a=new int[n];
	
	for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
	int r=0,sum=0;
	for(int i=0;i< n;i++){
	 r=a[i]%10;
	 if(r==2 || r==5){
		 sum=sum+a[i];
	
	 }
	 
	 
	}
    System.out.println(sum);
	}

}
