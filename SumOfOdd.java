package com.ass1;

import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int p = n;
    int r=0,sum=0;
    int counter = 0;
    while(p > 0){
    	counter++;
    	p = p / 10;
    }
    int[] arr = new int[counter];
    int k = 0;
    while(n>0){
    	r = n % 10;
    	arr[k] = r;
    	k++;
    	n = n / 10;
    }
    
    for(int i = 0;i < counter;i++)
    	if(arr[i]%2 !=0){
    	sum=sum+arr[i];	
    	}
    System.out.println(sum);
     
	}

}
