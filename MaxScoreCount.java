package com.ass7;

import java.util.Scanner;

public class MaxScoreCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		int []b=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++){
			b[i]=sc.nextInt();
		}
	    int count=0; 
		for(int i=0;i<n;i++){
			if(a[i]>b[i]){
				count++;
			}
		}
		System.out.println(count);

	}

}
