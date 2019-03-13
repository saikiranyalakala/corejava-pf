package com.practice1;

import java.util.Scanner;

public class TargetPractice {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int e=sc.nextInt();
    int []a =new int[e];
    
    for(int i=0;i<e;i++)
    {
     a[i]=sc.nextInt();	
    }
    
    for(int i=0;i<e;i++){
    	if(a[i]>=n){
    	System.out.println("The winner is the distence  " +a[i]);	
    	}
    }
	}

}
