package com;

import java.util.Scanner;

public class CountNotes {

	public static void main(String[] args) {
		int amt=3575;int i=0;
		int [] ten={2000,1000,500,100,50,20,10,5,2,1};
		int [] num=new int[ten.length];
		
		while(amt>0){
			num[i]=amt/ten[i];	
			amt=amt%ten[i];	
			}
		
		for( i=0;i<ten.length;i++){
		System.out.println("num"+i);
		}
	}

}
