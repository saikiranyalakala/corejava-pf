package com.ass1;

import java.util.Scanner;

public class Milege {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cc=sc.nextInt();
		
		
		if(cc>=100 && cc<=125){
			System.out.println(75);
		}
		if(cc>=126 && cc<=135){
			System.out.println(70);
		}
		if(cc>=136 && cc<=150){
			System.out.println(60);
		}
		if(cc>=151 && cc<=200){
			System.out.println(50);
		}
		if(cc>=201 && cc<=220){
			System.out.println(35);
		}

	}

}
