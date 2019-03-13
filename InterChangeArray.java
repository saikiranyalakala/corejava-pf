package com.ass1;

import java.util.Scanner;

public class InterChangeArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [] a= new int[4];
     for(int i=0;i<a.length;i++)
     {
    	 a[i]=sc.nextInt();
     }
     int temp=0;
     for(int i=0;i<a.length;i++){
    	 
    	 
    	
    		 a[0]=a[4];
    		 a[4]=a[0];
    		 a[2]=a[3];
    		 a[3]=a[2];
    			
    		 
    	   
    	 }
    	 System.out.println(a[4]);
     }
	}


