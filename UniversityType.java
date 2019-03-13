package com.ass1;

import java.util.Scanner;

public class UniversityType {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []a=new int [n];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	int sum=0;
	for(int i=0;i<a.length;i++){
	 
	  sum=sum+a[i];
	  
	}
    sum=sum/n;
    if(sum>80){
    	System.out.println("First class");
    	
    }
    else if(sum>60){
    	System.out.println("Second Grade University");
    }
    else{
    	System.out.println("Third Grade University");
    }
	}

}
