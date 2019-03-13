package com.ass7;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int r,sum=0,temp=0;
		while(num>0)
		{
			r=num%10;
			sum=sum+fact(r);
			num=num/10;
		}
		if(temp==sum){
			System.out.println("Yes,it is strong number");
		}
		else
		{
			System.out.println("No,It is not a strong number");
		}
	}
		public static int fact(int n)
		{
			int fact=1;
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			
		
		return fact;
	}
}