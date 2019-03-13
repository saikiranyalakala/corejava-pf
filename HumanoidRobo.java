package com;

import java.util.Scanner;

public class HumanoidRobo {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a Name");
	 String s=sc.nextLine();
	 System.out.println("Enter Creator Name");
	 String s1=sc.nextLine();
	 System.out.println("Enter the Purpose");
	 String s3=sc.nextLine();
	 System.out.println("Memory Space");
	 int memory=sc.nextInt();
	 System.out.println("Speed");
	 float speed=sc.nextFloat();
	 
	System.out.println("My Details :" +"\n"+ "I am the robot named " +s 
			+"\nI was created by " +s1
			+"\nI am created for the purpose of " +s3
			+"\nMy memory space is around "+memory +"Gb"+" and my speed is "+speed+"Tb");
	
	 

	}

}
