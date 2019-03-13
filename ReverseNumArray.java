package com.arrays;

import java.util.Scanner;

public class ReverseNumArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int []a=new int[n];
    
    for(int i=0;i<a.length;i++){
    	a[i]=sc.nextInt();
    }
    int sum=0,r=0;
    
    for(int i=0;i<a.length;i++){
    	for(int j=i+1;j<a.length;j++){
    		if(i<j){
    			a[i]=a[i]+a[j];
    			a[j]=a[i]-a[j];
    			a[i]=a[i]-a[j];
    		}
    	}
    	}
    	
    
    for(int i=0;i<n;i++){
    System.out.print(a[i]+ " ");
    }
	}

}
