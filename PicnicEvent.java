package com.mock123;

import java.util.Scanner;

public class PicnicEvent {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    String s1=new String();
    String s2=new String();
    s1=sc.next();
    int length=s1.length();
    for(int i=0;i<length;i++){
    	char c=s1.charAt(i);
    	if(s2.charAt(i)<0)
    	{
    	
    	 s2=s2+c;
    }
    }
    System.out.println(s2);
   
	}

}
