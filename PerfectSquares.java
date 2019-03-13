package com.ass1;

import java.util.Scanner;

public class PerfectSquares {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        double r=Math.sqrt(n);
        double s=n/r;
        
        if(r==s){
        System.out.println("yes");
      
        }
        else{
        System.out.println("no");
        }
	}

}
