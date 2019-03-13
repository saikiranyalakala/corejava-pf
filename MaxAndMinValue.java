package com.arrays;

import java.util.Scanner;

public class MaxAndMinValue {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int []a=new int[n];
    
    for(int i=0;i<n;i++){
    	a[i]=sc.nextInt();
    }
    int temp=0;
    for(int i=0;i<n;i++){
    	for(int j=0;j<n;j++){
    	while(a[i]>a[j]){
    		temp=a[i];
    		a[i]=a[j];
    		a[j]=temp;
    	}
    }
    }
    for(int i=0;i<n;i++){
    System.out.println("Max element is"+a[n-1]+" min element is"+a[0]);
    break;
    
	}
}
}