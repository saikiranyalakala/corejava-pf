package com.ass1;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int num=sc.nextInt();
		int r,sum=0,temp=0;
		temp=num;
		
		while(num>0)
	{
		r=num%10;
		sum=(sum)+(r*r*r);
		num=num/10;
	}
    
   // System.out.println(sum);
		if(temp==sum){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
			
		
		
			
	 
		
		
  }
}


