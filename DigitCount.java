package com.ass7;

import java.util.Scanner;

public class DigitCount {
public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	int temp=n;
	int count=0;
	while(temp>0){
	 count++;
	 temp=temp/10;
	}
	System.out.println(count);
}
}
