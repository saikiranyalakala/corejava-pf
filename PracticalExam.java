package com.mock123;

import java.util.Scanner;

public class PracticalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int number=0;
		
		
			int rem = n%10;
			if(rem==0 || rem==1 || rem==2 || rem==3 || rem==4 || rem==5)
			{
				for(int i=0;i<99;i++)
				{
					number=i;
				}
			}
			
		
		
		System.out.println(number);
	}

}
