package com.ass1;

import java.util.Scanner;

public class CricketerId {
 public static void main(String [] args){
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int [] a=new int[n];
	 
	 for(int i=0;i<a.length;i++){
		 a[i]=sc.nextInt();
	 }
	 int e=sc.nextInt();
	 
	 for(int i=0;i<n;i++){
		 if(i%2!=0){
			 if(a[i]>e){
				 System.out.println(a[i-1]);
			 }
		 }
	 }
 }
}
