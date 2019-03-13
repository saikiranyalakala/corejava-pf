package com.strings;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String rev="";
    int len=s.length();
    
    for(int i=len-1;i>=0;i--)
    {
    	rev=rev+s.charAt(i);
    }
    System.out.println(rev);
	}

}
