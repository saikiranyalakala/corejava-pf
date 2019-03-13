package com;

import java.util.Scanner;

public class Intercepts {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value of m");
	int m=sc.nextInt();
	System.out.println("Enter value of c");
	int c=sc.nextInt();
	
	int x=0,y=0;
	if(m>0){
		y=m*x+c;
		System.out.println("The y intercept is"+y);
	
	if(m>0){
		x=(y-c)/m;
		System.out.println("The x intercept is " +x);
	}
	}
	
	
	
	

	}

}
