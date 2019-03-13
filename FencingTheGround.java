package com;

import java.util.Scanner;

public class FencingTheGround {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the Ground");
		int l=sc.nextInt();
		System.out.println("Enter width of the Ground");
		int w=sc.nextInt();
		int len= 2*(l+w);
		int qty=l*w;
		System.out.println("The length of the rope needed is " +len+"m");
		System.out.println("The quantity of the rope needed is "+qty+"sqm");
		

	}

}
