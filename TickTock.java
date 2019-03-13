package com.practice1;

import java.util.Scanner;

public class TickTock {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n<=24)
		{
		if(n%3==0){
			System.out.println("Tick Tock");
			
		}
		else{
			System.out.println("No Tick Tock");
		}

	}
 }

}
