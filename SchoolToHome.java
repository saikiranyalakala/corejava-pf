package com.mock123;

import java.util.Scanner;

public class SchoolToHome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double c=Math.sqrt((a*a)+(b*b));
        System.out.println((int)c);
	}

}
