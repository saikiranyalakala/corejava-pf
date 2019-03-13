package com.mock123;
import java.util.Scanner;

public class BanglesGift {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		int r1=sc.nextInt();
		int r2=sc.nextInt();
		
		double d=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		
		if(d>(r1+r2)){
			System.out.println("Do not Touch");
		}
		if(d<(r1+r2))
		{
			System.out.println("Intersects");
		}
		if(d==(r1+r2))
		{
			System.out.println("Touches");
		}
   System.out.printf("%.2f",d);
	}

}
