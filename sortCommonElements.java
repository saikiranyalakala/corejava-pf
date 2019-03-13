package com.ass1;

import java.util.Scanner;

public class sortCommonElements {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int [] a=new int[n];
	int [] b=new int[n];
	for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
	for(int j=0;j<n;j++){
		b[j]=sc.nextInt();
	}
	
	int sum=0;int flag=1,count=0;
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(i==j)
			{
			if(a[i]==b[j]){
		       count++;
			}
			}      
		
	}
		 
  }
	int temp=0;
	for(int i=0;i<count;i++){
		for(int j=0;j<count;j++){
			if(a[i]>b[j]){
			temp=a[i];
			a[i]=b[j];
			b[j]=temp;
			}
		}
	}
	System.out.println(temp);
 }
}



