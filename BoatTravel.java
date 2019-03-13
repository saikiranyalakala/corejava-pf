package com.mock123;
import java.util.Scanner;
public class BoatTravel {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int n3=sc.nextInt();
	int d=0;
	if(n2>0){
	d=n3/(n1+n2);
	}
	if(n2<0){
    d=n3/(n1-n2)+1;
	}
	System.out.println(d);
}
}
