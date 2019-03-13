package com.ass1;

import java.util.Scanner;

public class GenerateNewNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r,sum=0;

	        while(n>0){
				r=n%10;
				sum=(sum*10)+r;
				n=n/10;
			}
		//System.out.println(sum);
		
		while(sum>0){
		r=sum%10;
		r = r + 2;
		System.out.print(r);
		sum=sum/10;
		}

	}

}
