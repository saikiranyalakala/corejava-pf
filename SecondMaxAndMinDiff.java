package com.ass7;

import java.util.Scanner;

public class SecondMaxAndMinDiff {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []a=new int[n];
	
	for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
	
	int temp=0;
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			if(a[i]>a[j]){
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}
	}
	}
	int diff=Math.abs(a[1]-a[n-2]);
	System.out.println(diff);

}
}