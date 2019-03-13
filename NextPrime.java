package com.ass7;

import java.util.Scanner;

public class NextPrime {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   
    while(1==1){
    	n=n+1;
    	int count=0;
    for(int i=2;i<n;i++){
         if(n%i==0){
    	 count++;
    	}
         
    }
    	if(count==0){
    		System.out.println(n);
    		break;
    	
     }
	}
  }
}
