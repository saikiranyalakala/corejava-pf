package com.mock123;

import java.util.Scanner;

public class TwoNumbers {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
     int n1=sc.nextInt();
     int n2=sc.nextInt();
     double diff=Math.sqrt((n1*n1)-4*n2);
     double x=(n1-diff)/2;
     double y=n1-x;
     
     System.out.print((int)x+" ");
     System.out.print((int)y);
	}
	

}
