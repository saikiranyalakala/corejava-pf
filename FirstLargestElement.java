package com.ass1;

import java.util.Scanner;

public class FirstLargestElement {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []a=new int[n];
	
	for(int i=0;i<a.length;i++){
		a[i]=sc.nextInt();
		
	}
	int temp=0;
	for(int i=0;i<a.length;i++){
		for(int j=0;j<a.length;j++){
			if(a[i]>a[j]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int i=0;i<a.length;i++){
		System.out.println(a[0]*a[2]);
		break;
	}
	}

}
