package com.mock123;

import java.util.Scanner;

public class ShareAnApple {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        int c=a-1;
        int d=b+1;
        if(c==d)
        {
        	System.out.println(true);
        	System.out.println(c);
        }
        if(a>b){
        	System.out.println(false);
        	System.out.println(a-b);
        }
        if(b>a)
        {
        	System.out.println(false);
        	System.out.println(b-a);
        }
	}

}
