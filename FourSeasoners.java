package com;

import java.util.Scanner;

public class FourSeasoners {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x1");
		float x1=sc.nextFloat();
		System.out.println("Enter y1");
		float y1=sc.nextFloat();
		System.out.println("Enter x2");
		float x2=sc.nextFloat();
		System.out.println("Enter y2");
		float y2=sc.nextFloat();
		System.out.println("Enter x3");
		float x3=sc.nextFloat();
		System.out.println("Enter y3");
		float y3=sc.nextFloat();
		
		float mid1=(x1+x2+x3)/3;
		float mid2=(y1+y2+y3)/3;
		
		System.out.println("Binary house is located at ("+(float)mid1+","+(float)mid2+")");

	}

	

}
