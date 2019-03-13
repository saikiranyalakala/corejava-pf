package com.ass1;

import java.util.Scanner;

public class PowerofTwo {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	int i=1;
	while(true){
		if(Math.pow(2, i)==n){
			System.out.println("yes");
			break;	
		}
		else if(Math.pow(2, i)>n){
			System.out.println("no");
			break;
		}
		i++;
	}

     
	}

}
