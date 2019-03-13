package com.ass1;

import java.util.Scanner;

public class FindIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] a=new int [n];
		
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		int e=sc.nextInt();
        int temp=0;
		for(int i=0;i<n;i++){
			if(a[i]==e){
	         System.out.println(i);
			}
		}
	}

}
