package com.ass1;

import java.util.Scanner;

public class DailyAllowance {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[]a=new int [n];
	
	for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++){
		int s=a[0]*15;
		int r=a[1]*10;
		int o=a[2]*5;
		int sum=s+r+o;
		System.out.println(sum);
		break;
	}
	

	}

}
