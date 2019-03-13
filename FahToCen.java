package com;

import java.util.Scanner;

public class FahToCen {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	
	if(n<0){
		System.out.println("Invalid Input");
		System.exit(0);
	
	
	}
	System.out.println(FahToCen.ConvertToCentigrade(n));
	}
	public static double ConvertToCentigrade(int f){
		
		int c=((f-32)/9)*5;
		
		return c;
	}

		
	}
	
	

	


