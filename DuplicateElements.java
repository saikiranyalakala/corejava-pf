package com;

import java.util.Scanner;

public class DuplicateElements {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String");
     String s=sc.nextLine();
     String temp="";
    
     
    for(int i=0;i<s.length();i++){
    
    	for(int j=i+1;j<s.length();j++){
    	if(s>0){
    		temp=ar[i];
    		ar[i]=ar[j];
    		ar[j]=temp;
    	}
    	
    }
 }
   for(int i=0;i<ar.length;i++){
	   System.out.println(ar[i]+"");
   }
    }

	}


