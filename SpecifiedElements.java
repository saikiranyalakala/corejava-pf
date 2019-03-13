package com.arrays;

import java.util.Scanner;

public class SpecifiedElements {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
	int [] a= new int [n];
	
	for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
	int e1=sc.nextInt();
	int e2=sc.nextInt();
	int flag=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==e1 && a[i]==e2){
			flag=1;
			break;
		}
		else{
			flag=0;

		}
	 }
	if(flag==1){
		System.out.println("Elements not found in the Array");
	}
	else{
		System.out.println("Elements found");
	}
	}

}
